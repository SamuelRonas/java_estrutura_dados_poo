package samuel.ronas.setembro;

// Crie suas classes aqui
class Cachorro{
    
    String nome;
    int idade;
    String raca;
    
    public void latir(String nome){

    System.out.println(nome + " esta latindo");
    }

     public void comer(String nome){

    System.out.println(nome + " esta comendo");
    }

    //Isso abaixo e um construtor tem que se ter o mesmo nome da classe
    public Cachorro(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;

    }
}



public class Atividades {
    public static void main(String[] args) {


        // instancie e printe aqui Ex:
        // TipoDoObjeto nomeDoObjeto = new Construtor(Parametros);
        Cachorro viraLata = new Cachorro("ronaldo", 12, "pincher");
        Cachorro doberman = new Cachorro("messi", 15, "doberman");

        // Utilize o comando abaixo para printar seus objetos Ex:
        //apague a linha 22
        System.out.println(viraLata.nome);
        System.out.println(viraLata.idade);
        System.out.println(viraLata.raca);
        viraLata.latir(viraLata.nome);
        viraLata.comer(viraLata.nome);
        doberman.latir(doberman.nome);
        doberman.comer(doberman.nome);
        System.out.println(doberman.nome);
        System.out.println(doberman.idade);
        System.out.println(doberman.raca);
    }
}
