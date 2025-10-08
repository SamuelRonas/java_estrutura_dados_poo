package joao.ronas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando algumas caixas
        List<Caixa> caixas = new ArrayList<>();
        caixas.add(new Caixa("Vermelha", "Pequena"));
        caixas.add(new Caixa("Azul", "Grande"));
        caixas.add(new Caixa("Verde", "Média"));
        caixas.add(new Caixa("Vermelha", "Grande"));
        caixas.add(new Caixa("Azul", "Pequena"));

        // Separar caixas por cor
        List<Caixa> vermelhas = CaixaService.separarPorCor(caixas, "Vermelha");
        System.out.println("Caixas vermelhas: " + vermelhas.size());

        // Separar caixas por tamanho
        List<Caixa> grandes = CaixaService.separarPorTamanho(caixas, "Grande");
        System.out.println("Caixas grandes: " + grandes.size());
    }
}

// Classe representando a Caixa
class Caixa {
    private String cor;
    private String tamanho;

    public Caixa(String cor, String tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }
}

// Serviço responsável pelas funções de filtragem
class CaixaService {

    // Separar caixas por cor
    public static List<Caixa> separarPorCor(List<Caixa> caixas, String cor) {
        List<Caixa> resultado = new ArrayList<>();
        for (Caixa c : caixas) {
            if (c.getCor().equalsIgnoreCase(cor)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    // Separar caixas por tamanho
    public static List<Caixa> separarPorTamanho(List<Caixa> caixas, String tamanho) {
        List<Caixa> resultado = new ArrayList<>();
        for (Caixa c : caixas) {
            if (c.getTamanho().equalsIgnoreCase(tamanho)) {
                resultado.add(c);
            }
        }
        return resultado;
    }
}
