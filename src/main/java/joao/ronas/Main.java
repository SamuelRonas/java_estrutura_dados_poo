package joao.ronas;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

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
        List<Caixa> verdes = CaixaService.separarPorCor(caixas, "Verde");
        System.out.println("Caixas Verde: " + verdes.size());

       
    }
}

// Classe representando a Caixa
@Data
class Caixa {
    public String cor;
    public String tamanho;

    public Caixa(String cor, String tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }
}


class CaixaService {
    
    // Metodo ou função
    public static List<Caixa> separarPorCor(List<Caixa> caixas, String cor){
        List<Caixa> resposta = new ArrayList<>();
                        //Enquanto
        for(int i = 0; i < caixas.size(); i++)
        {
            if(caixas.get(i).cor == cor){
                resposta.add(caixas.get(i));
            }
        }

        return resposta;
    }
    
   
}
