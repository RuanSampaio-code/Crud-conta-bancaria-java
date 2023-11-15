//Banco que representa um banco em um sistema.
public class Banco {
    
    private String nome;

    //cosntrutor
    public Banco(String nome) {
        this.nome = nome;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
