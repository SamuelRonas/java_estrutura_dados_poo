package matheus.ronas.outubro.atividade_entregas.service;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import matheus.ronas.outubro.atividade_entregas.dto.Entrega;

@ApplicationScoped
public class EntregaService {
    private List<Entrega> entregas = new ArrayList<>();

    public EntregaService() {
        entregas.add(new Entrega("1", "São Paulo", "PENDENTE", 10.5, 50));
        entregas.add(new Entrega("2", "Rio de Janeiro", "ENTREGUE", 5.0, 30));
        entregas.add(new Entrega("3", "Curitiba", "EM_TRANSPORTE", 7.2, 45));
        entregas.add(new Entrega("4", "Sorocaba", "EM_TRANSPORTE", 12.4, 85));
        entregas.add(new Entrega("5", "São Jose dos Campos", "ENTREGUE", 10.0, 20));
        entregas.add(new Entrega("6", "Anápolis", "EM_TRANSPORTE", 18.7, 62));
        entregas.add(new Entrega("7", "Belo Horizonte", "PENDENTE", 14.9, 72));
    }

      // 1. Listar pendentes
    public List<Entrega> listarPendentes() {
        List<Entrega> resultado = new ArrayList<>();
        for (Entrega e : entregas) {
            if (e.getStatus().equalsIgnoreCase("PENDENTE")) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public List<Entrega> listarPesadas(){
        List<Entrega> resultado = new ArrayList<>();
        double compara = 10.0;

        for(int i = 0; i < entregas.size(); i++){
            if(entregas.get(i).getPeso() > compara){
                resultado.add(entregas.get(i));
            }
        }
        return resultado;
    }

    // 2. Calcular valor total de entregues
    // public double calcularValorTotal() {
    //     double soma = 0;
    //     for (int i = 0; i = ) {
    //         if (e.getStatus().equalsIgnoreCase("ENTREGUE")) {
    //             soma += e.getValorFrete();
    //         }
    //     }
    //     return soma;
    // }
        public List<Entrega> buscarPorDestino(String destino) {
        List<Entrega> resultado = new ArrayList<>();
        for (Entrega e : entregas) {
            if (e.getDestino().toLowerCase().contains(destino.toLowerCase())) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    
}
