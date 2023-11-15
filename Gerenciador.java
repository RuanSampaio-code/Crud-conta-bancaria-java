// interface Gerenciador que define um contrato para as classes que a implementam
public interface Gerenciador {
    
    //métodos abstratos
    public abstract void adicionarConta(ContaBancaria conta);
    public abstract void exibirContasNaInterfaceGrafica();
    public abstract void alterarConta(String numero, ContaBancaria novaConta);
    public abstract void removerConta(String numero);
    
}
