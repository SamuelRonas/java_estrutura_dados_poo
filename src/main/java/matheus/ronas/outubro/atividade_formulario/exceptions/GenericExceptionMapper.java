package matheus.ronas.outubro.atividade_formulario.exceptions;

import java.util.Map;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Exception> {
@Override
public Response toResponse(Exception exception){
    return Response.status(Response.Status.BAD_REQUEST)
    .entity(Map.of("erro",exception.getMessage()))
    .build();
}
}
