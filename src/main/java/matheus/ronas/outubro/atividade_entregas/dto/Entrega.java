package matheus.ronas.outubro.atividade_entregas.dto;

import lombok.Data;

@Data
public class Entrega {
    private String id;
    private String destino;
    private String status; // "PENDENTE", "EM_TRANSPORTE", "ENTREGUE"
    private double peso;
    private double valorFrete;

     public Entrega(String id, String destino, String status, double peso, double valorFrete) {
        this.id = id;
        this.destino = destino;
        this.status = status;
        this.peso = peso;
        this.valorFrete = valorFrete;
    }
}
