package matheus.ronas.outubro.atividade_formulario.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NomeService {

    public String contaPalavra(String nome) {
        if (nome == null || nome.isBlank()) {
            return "Nome Invalido!";
        }
        return nome;
    }

    public String deixarMinusculo(String nome) {
        if (nome == null) return "Nome Invalido!";
        return nome.toLowerCase();
    }

    public String retiraEspacos(String nome) {
        if (nome == null) return "Nome Invalido!";
        return nome.replaceAll(" ","");
    }
}
