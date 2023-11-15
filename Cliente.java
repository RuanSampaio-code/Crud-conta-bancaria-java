// Cliente que representa um cliente no sistema.
public class Cliente {
   
    //atributo nome
    private String nome;

    //construtor
    public Cliente(String nome) {
        this.nome = nome;
    }

    //get e ste
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
