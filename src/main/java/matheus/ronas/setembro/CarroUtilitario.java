package matheus.ronas.setembro;

import lombok.Data;

enum EstadoRoda {
    NOVA,
    VELHA
}

@Data
public class CarroUtilitario {

    Boolean Macaco;
    Boolean ChaveR;
    Boolean Estepe;
    EstadoRoda roda;
    String nome;
    

    public CarroUtilitario(String nome, Boolean Macaco, Boolean ChaveR, Boolean Estepe, EstadoRoda estado){
        this.nome = nome;
        this.Macaco = Macaco;
        this.ChaveR = ChaveR;
        this.Estepe = Estepe;
        this.roda = estado;
    }
      
    
    public CarroUtilitario(){

    }
}
