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
        // 🔹 CHAMADA FUNÇÃO SOMAR MULTIPLOS DE 5
        // =========================================

        System.out.println(somaMultiplosCinco(numeros));
        
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
        int resultado = 0; 

        for( int o : numeros){
            if(o >= 10){
                resultado = resultado + o;
            }
        }
        return resultado;
    }

    private static int somaMultiplosCinco(List<Integer> numeros){
        // 🔹 PASSO 1: CRIAR RESULTADO
        // 🔹 PASSO 2: CRIAR LOOP
        // 🔹 PASSO 3: DENTRO DO LOOP CRIAR CONDIÇÃO SENDO O QUE REPRESENTA SEU NUMERO MODULO % DE 5 == 0 
        // 🔹 PASSO 4: SE A CONDICAO ESTIVER VERDADEIRA FAZER RESULTADO RECEBE RESULTADO + O QUE REPRESENTA SEU NUMERO
        // 🔹 PASSO 1: RETORNAR RESULTADO
    }


}
