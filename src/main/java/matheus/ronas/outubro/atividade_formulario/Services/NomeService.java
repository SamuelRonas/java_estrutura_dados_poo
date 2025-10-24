package matheus.ronas.outubro.atividade_formulario.Services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NomeService {

    public String retiraEspacos(String nome) {
        return nome.replaceAll("\\s+", "");
    }

    public String contaPalavra(String nome) {
        if (nome.length() < 10) {
            return "Nome Invalido!";
        } else {
            return null;
        }
    }

    public String deixarMinusculo(String nome) {
        return nome.toLowerCase();

    }

}
