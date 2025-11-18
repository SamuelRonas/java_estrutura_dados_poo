package matheus.ronas.outubro.atividade_formulario.resources;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import matheus.ronas.outubro.atividade_formulario.domain.EmailInput;
import matheus.ronas.outubro.atividade_formulario.domain.EmailOutput;
import matheus.ronas.outubro.atividade_formulario.services.EmailService;

@Path("/email")

public class EmailResource {
    @Inject
    EmailService emailService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    
public EmailOutput email(EmailInput input){

EmailOutput resultado = emailService.validaEmail(input);
return resultado;
}
}