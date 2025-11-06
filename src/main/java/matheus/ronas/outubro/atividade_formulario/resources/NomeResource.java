package matheus.ronas.outubro.atividade_formulario.resources;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import matheus.ronas.outubro.atividade_formulario.domain.NomeDomainInput;
import matheus.ronas.outubro.atividade_formulario.services.NomeService;

@Path("/nome")
public class NomeResource {
    @Inject
    NomeService nomeService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String nome(NomeDomainInput input) {
        if (input == null || input.getNome() == null || input.getNome().isBlank()) {
            return "Nome Invalido!";
        }

        String nomeOriginal = input.getNome();
        String resultado = nomeService.contaPalavra(nomeOriginal);

        if (resultado == null || "Nome Invalido!".equals(resultado)) {
            return "Nome Invalido!";
        }

        resultado = nomeService.deixarMinusculo(resultado);
        resultado = nomeService.retiraEspacos(resultado);

        return resultado;
    }
}
