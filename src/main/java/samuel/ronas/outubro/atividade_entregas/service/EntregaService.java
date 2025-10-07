package samuel.ronas.outubro.atividade_entregas.service;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import samuel.ronas.outubro.atividade_entregas.dto.Entrega;

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

    // Métodos a implementar...
}
