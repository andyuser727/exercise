package exercise.service;

import exercise.shared.SimpleResponse;
import exercise.shared.dto.RpcDto;
import exercise.shared.AppResponse;

/**
 * Created with IntelliJ IDEA.
 * User: AndySmith
 * Date: 13/12/2013
 * Time: 19:47
 * To change this template use File | Settings | File Templates.
 */
public interface Handler<T extends RpcDto> {
    public Class getIncomingCommandClass();
    public AppResponse execute(T dto) throws Exception;

}
