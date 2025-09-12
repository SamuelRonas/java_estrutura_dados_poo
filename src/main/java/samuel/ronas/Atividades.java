package samuel.ronas;

// Crie suas classes aqui
class Classe{
    String atributo;

    //Isso abaixo e um construtor tem que se ter o mesmo nome da classe
    public Classe(String parametro){
        this.atributo = parametro;
    }
}



public class Atividades {
    public static void main(String[] args) {


        // instancie e printe aqui Ex:
        // TipoDoObjeto nomeDoObjeto = new Construtor(Parametros);
        Classe objeto = new Classe("xpto");

        // Utilize o comando abaixo para printar seus objetos Ex:
        //apague a linha 22
        System.out.println(objeto.atributo);
        System.out.println();
    }
}
