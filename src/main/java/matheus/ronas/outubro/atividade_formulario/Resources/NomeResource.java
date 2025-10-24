package matheus.ronas.outubro.atividade_formulario.Resources;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import matheus.ronas.outubro.atividade_formulario.Domain.NomeDomainInput;
import matheus.ronas.outubro.atividade_formulario.Services.NomeService;

@Path("/nome")

public class NomeResource {
    @Inject
    NomeService nomeService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    // Samuel Ronas
    public String nome(NomeDomainInput input) {
        String resultado = "";
        if (nomeService.contaPalavra(input.getNome()) == "Nome Invalido!") {
            return "Nome Invalido!";
        } else {
            resultado = nomeService.deixarMinusculo(input.getNome());
            resultado = nomeService.retiraEspacos(resultado);

            return resultado;
        }
    }
}