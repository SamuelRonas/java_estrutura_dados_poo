package matheus.ronas.outubro.atividade_formulario.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class NomeDomainInput {
    private String nome;

    public NomeDomainInput() {
        // Construtor vazio é obrigatório para desserialização JSON
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
