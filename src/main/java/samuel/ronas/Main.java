package samuel.ronas;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        CarroUtilitario fox = new CarroUtilitario("fox", false, false, false, EstadoRoda.VELHA);
        CarroUtilitario hb20 = new CarroUtilitario("hb20", false, false, false, EstadoRoda.NOVA);
        CarroUtilitario sandero = new CarroUtilitario("sandero", true, true, true, EstadoRoda.VELHA);
        CarroUtilitario i30 = new CarroUtilitario("i30", true, true, true, EstadoRoda.VELHA);

        Queue<CarroUtilitario> filaCarros = new LinkedList<>();
        filaCarros.add(fox);
        filaCarros.add(hb20);
        filaCarros.add(sandero);
        filaCarros.add(i30);

        System.out.println(filaCarros);

        oficina(filaCarros);

        System.out.println(filaCarros);
    }

    private static void oficina(Queue<CarroUtilitario> filaCarros) {
        while (!filaCarros.isEmpty()) {
            CarroUtilitario carro = filaCarros.poll(); // remove sempre o 1º da fila
            trocaRodaCarroUtilitario(carro);
        }
    }

    private static void trocaRodaCarroUtilitario(CarroUtilitario carro) {
        if (carro.Macaco && carro.ChaveR && carro.Estepe && carro.roda == EstadoRoda.VELHA) {
            carro.roda = EstadoRoda.NOVA;
            System.out.println(carro.getNome() + " teve a roda trocada.");
        } else {
            System.out.println(carro.getNome() + " não conseguiu trocar a roda.");
        }
    }
}
