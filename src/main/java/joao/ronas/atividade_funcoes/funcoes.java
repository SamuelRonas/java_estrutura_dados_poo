package joao.ronas.atividade_funcoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class funcoes {
    public static void main(String[] args) {

        // ==============================
        // 🔹 DEFINE A LISTA DE NUMEROS
        // ==============================

        List<Integer> numeros = Arrays.asList(5, 10, 15, 20, 25, 30, 35);

        // ==============================
        // 🔹 CHAMADA FUNÇÃO CONTA PARES
        // ==============================

        System.out.println(contaPares(numeros));
        
        // =====================================
        // 🔹 CHAMADA FUNÇÃO SOMA MAIOR QUE 10
        // =====================================

        System.out.println(somaMaiorQueDez(numeros));

        // =========================================
        // 🔹 CHAMADA FUNÇÃO LISTAR MULTIPLOS DE 5
        // =========================================


        
    }

    private static int contaPares(List<Integer> numeros) {
        int resultado = 0; 
        for (int n : numeros) {
            if (n % 2 == 0) {
                resultado++;
            }
        }
        return resultado;
    }
    

    private static int somaMaiorQueDez(List<Integer> numeros){
        // 🔹 PASSO 1: CRIAR UMA VARIAVEL PARA RESULTADO DO MESMO TIPO DO RETORNO DA FUNÇÃO

        // 🔹 PASSO 2: CRIAR UM LOOP PARA PERCORRER TODOS OS NUMEROS UM A UM 

        // 🔹 PASSO 3: PARA CADA NUMERO CRIAR UMA COMPARAÇÃO SE NUMERO MAIOR QUE 10 

        // 🔹 PASSO 4: CASO CONDIÇÃO VERDADEIRA ADICIONAR NO RESULTADO O VALOR DE RESULTADO + VALOR DO NUMERO 

        // 🔹 PASSO 5: FORA DA CONDIÇÃO E DO LOOP RETORNAR O RESULTADO
    }


}
