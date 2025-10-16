package matheus.ronas.outubro.atividade_pesquisa;

import java.util.*;
import java.util.stream.*;

public class service {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 10, 15, 20, 25, 30, 35);

        // System.out.println("=== Exercício 1: Filtrar números pares ===");
        // List<Integer> pares = filtrarParesStream(numeros);
        // System.out.println("Com Stream: " + pares);
        System.out.println("Sem Stream: " + filtrarParesManual(numeros));

        // System.out.println("\n=== Exercício 2: Somar números maiores que 10 ===");
        // int soma = somarMaioresQueDezStream(numeros);
        // System.out.println("Com Stream: " + soma);
        System.out.println("Sem Stream: " + somarMaioresQueDezManual(numeros));

        // System.out.println("\n=== Exercício 3: Converter para string separada por
        // vírgulas ===");
        // String texto = converterParaStringStream(numeros);
        // System.out.println("Com Stream: " + texto);
        // System.out.println("Sem Stream: " + converterParaStringManual(numeros));
    }

    // ==============================
    // 🔹 EXERCÍCIO 1 – FILTRAR PARES
    // ==============================
    public static List<Integer> filtrarParesStream(List<Integer> numeros) {
        // TODO: retornar apenas os números pares
        // Dica: utilize filter() e collect()
        return null; // substitua com o retorno correto
    }

    public static List<Integer> filtrarParesManual(List<Integer> numeros) {

        List<Integer> resultado = new ArrayList<Integer>();

        for (int n:numeros) {
            if (n % 2 == 0) {
                resultado.add(n);
            }
        }
        return resultado;
    }

    // =======================================
    // 🔹 EXERCÍCIO 2 – SOMAR MAIORES QUE 10
    // =======================================
    public static int somarMaioresQueDezStream(List<Integer> numeros) {
        // TODO: somar apenas os números > 10
        // Dica: utilize filter() e reduce()
        return 0; // substitua com o retorno correto
    }

    public static int somarMaioresQueDezManual(List<Integer> numeros) {

        int resultado = 0;

        for (int n:numeros) {
            if (n > 10) {
                resultado += n;
            }

        }
        return resultado;
    }

    // ====================================================
    // 🔹 EXERCÍCIO 3 – CONCATENAR COMO TEXTO SEPARADO POR VÍRGULAS
    // ====================================================
    public static String converterParaStringStream(List<Integer> numeros) {
        // TODO: transformar a lista em uma String tipo "5, 10, 15..."
        // Dica: utilize map() e collect(Collectors.joining(", "))
        return null; // substitua com o retorno correto
    }

    public static String converterParaStringManual(List<Integer> numeros) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numeros.size(); i++) {
            sb.append(numeros.get(i));
            if (i < numeros.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
