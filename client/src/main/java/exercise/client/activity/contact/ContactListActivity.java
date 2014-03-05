package exercise.client.activity.contact;

import java.util.List;

import exercise.client.activity.BaseAbstractActivity;
import exercise.client.place.ContactDetailPlace;
import exercise.client.ui.contact.ContactListViewImpl;
import exercise.shared.SimpleResponse;
import exercise.shared.commands.LoadContactList;
import exercise.shared.commands.SaveContactDetail;
import exercise.shared.commands.SearchContacts;
import exercise.shared.dto.contact.ContactDetailDto;
import exercise.shared.AppResponse;
import exercise.shared.AppServiceAsync;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.view.client.*;
import com.google.inject.Inject;
import com.google.inject.Provider;
import exercise.shared.dto.contact.ContactListDto;

public class ContactListActivity extends BaseAbstractActivity<ContactListViewImpl> {

    private final AppServiceAsync appServiceAsync;
    private final EventBus eventBus;
    private PlaceController placeController;
    private ListDataProvider<ContactDetailDto> dataProvider;
    List<ContactDetailDto> contactDetailDtos;
    private Provider<ContactDetailPlace> contactDetailPlaceProvider;

    @Inject
    public ContactListActivity(EventBus eventBus, ContactListViewImpl display,
                               PlaceController placeController,
                               AppServiceAsync appServiceAsync,
                               Provider<ContactDetailPlace> contactDetailPlaceProvider) {
        super(display);
        this.appServiceAsync = appServiceAsync;
        this.eventBus = eventBus;
        this.placeController = placeController;
        this.contactDetailPlaceProvider = contactDetailPlaceProvider;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {

        createContactTable();
        container.setWidget(display.asWidget());
        display.getTablePanel().add(display.getTable());
        display.getTablePanel().add(display.getPager());
        display.getPager().setDisplay(display.getTable());
        loadContacts();
    }

    public void createContactTable() {

        CellTable<ContactDetailDto> table = new CellTable<ContactDetailDto>();

        TextColumn<ContactDetailDto> forenameColumn = new TextColumn<ContactDetailDto>() {
            @Override
            public String getValue(ContactDetailDto dto) {
                return dto.getForename();
            }
        };

        table.addColumn(forenameColumn);

        TextColumn<ContactDetailDto> surnameColumn = new TextColumn<ContactDetailDto>() {
            @Override
            public String getValue(ContactDetailDto dto) {
                return dto.getSurname();
            }
        };

        table.addColumn(surnameColumn);

        TextColumn<ContactDetailDto> streetColumn = new TextColumn<ContactDetailDto>() {
            @Override
            public String getValue(ContactDetailDto dto) {
                return dto.getStreet();
            }
        };

        table.addColumn(streetColumn);

        TextColumn<ContactDetailDto> cityColumn = new TextColumn<ContactDetailDto>() {
            @Override
            public String getValue(ContactDetailDto dto) {
                return dto.getCity();
            }
        };

        table.addColumn(cityColumn);

        TextColumn<ContactDetailDto> countyColumn = new TextColumn<ContactDetailDto>() {
            @Override
            public String getValue(ContactDetailDto dto) {
                return dto.getCounty();
            }
        };

        table.addColumn(countyColumn);

        TextColumn<ContactDetailDto> countryColumn = new TextColumn<ContactDetailDto>() {
            @Override
            public String getValue(ContactDetailDto dto) {
                return dto.getCountry();
            }
        };

        table.addColumn(countryColumn);

        TextColumn<ContactDetailDto> postalCodeColumn = new TextColumn<ContactDetailDto>() {
            @Override
            public String getValue(ContactDetailDto dto) {
                return dto.getPostalCode();
            }
        };

        table.addColumn(postalCodeColumn);

        display.setTable(table);

        final SingleSelectionModel<ContactDetailDto> selectionModel = new SingleSelectionModel<ContactDetailDto>();
        display.getTable().setSelectionModel(selectionModel);
        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            @Override
            public void onSelectionChange(SelectionChangeEvent event) {
                ContactDetailDto selected = selectionModel.getSelectedObject();
                if (selected != null) {
                    selectionModel.setSelected(selected, false);
                    ContactDetailPlace contactDetailPlace = contactDetailPlaceProvider.get();
                    // TODO use constructor with map
                    contactDetailPlace.getProperties().put("contact_id", String.valueOf(selected.getId()));
                    placeController.goTo(contactDetailPlace);
                }
            }
        });
    }

    public void doAddContact() {
        // go to the detail screen with no id to add a new contact
        ContactDetailPlace contactDetailPlace = contactDetailPlaceProvider.get();
        placeController.goTo(contactDetailPlace);
    }

    public void doLoadContacts(){

        // clear the search criteria as we're loading all of them now
        display.getForename().setValue(null);
        display.getSurname().setValue(null);
        display.getCity().setValue(null);
        display.getCounty().setValue(null);
        display.getCountry().setValue(null);
        display.getPostalCode().setValue(null);

        loadContacts();
    }

    public void doSearch() {

        // add all the partial string search criteria to the command
        SearchContacts searchContacts = new SearchContacts(display.getForename().getValue(),
                display.getSurname().getValue(),
                display.getStreet().getValue(),
                display.getCity().getValue(),
                display.getCounty().getValue(),
                display.getCountry().getValue(),
                display.getPostalCode().getValue());

        appServiceAsync.callServer(searchContacts,
                new AsyncCallback<AppResponse<ContactDetailDto>>() {
                    public void onFailure(Throwable caught) {
                        caught.printStackTrace();
                        display.getTablePanel().setVisible(false);
                    }

                    public void onSuccess(AppResponse<ContactDetailDto> result) {

                        // TODO change dto rubbish
                        contactDetailDtos = result.getDtos();
                        if (contactDetailDtos != null && contactDetailDtos.size() > 0) {
                            setComponents();
                            display.getTablePanel().setVisible(true);
                        }
                        else {
                            display.getTablePanel().setVisible(false);
                        }
                    }
                });
    }

    void loadContacts() {
        LoadContactList loadContactList = new LoadContactList();

        appServiceAsync.callServer(loadContactList,
                new AsyncCallback<AppResponse<ContactDetailDto>>() {
                    public void onFailure(Throwable caught) {
                        // Show the RPC error message to the user
                        display.getTablePanel().setVisible(false);
                    }

                    public void onSuccess(AppResponse<ContactDetailDto> result) {
                        contactDetailDtos = result.getDtos();
                        if (contactDetailDtos != null && contactDetailDtos.size() > 0) {
                            setComponents();
                            display.getTablePanel().setVisible(true);
                        }
                    }
                });
    }

    private void setComponents() {

        // set the data into the table
        if (dataProvider == null) {
            dataProvider = new ListDataProvider<ContactDetailDto>();
            dataProvider.addDataDisplay(display.getTable());
        }

        dataProvider.getList().clear();
        dataProvider.getList().addAll(contactDetailDtos);
    }

    @Override
    public void onStop() {
        // remove the data from the table
        if (dataProvider != null && display.getTable() != null) {
            dataProvider.removeDataDisplay(display.getTable());
        }
    }

}
