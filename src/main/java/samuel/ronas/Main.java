package samuel.ronas;

import lombok.Data;


@Data
class Banco{
    private String senha;
    public String nomeCLiente;
    private Number numero;

    public void trocaSenha(String novaSenha){
        if(novaSenha.length() > 8){
            this.senha = novaSenha;
        }
    }
}
@Data
class BancoFisico extends Banco {
    public String agencia;

    public BancoFisico(String s, String nome, Number numero, String agencia) {
        setSenha(s);
        this.nomeCLiente = nome;
        setNumero(numero);
        this.agencia = agencia;
    }

    public void trocaAgencia(String agencia) {
        if (agencia.startsWith("BB")) {
            this.agencia = agencia;
        }
    }
}
@Data
class BancoDigital extends Banco {
    public String versaoApp;

    public BancoDigital(String s, String nome, Number numero, String versaoApp) {
        setSenha(s);
        this.nomeCLiente = nome;
        setNumero(numero);
        this.versaoApp = versaoApp;
    }

    public void atualizaApp(String versaoApp) {
        if (versaoApp.startsWith("V")) {
            this.versaoApp = versaoApp;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        BancoFisico BB = new BancoFisico("DrG726Rs", "samuel", 85, "BBSP");
        BancoDigital nubank = new BancoDigital("null", "null", 54, "V1");
        
    }
}
