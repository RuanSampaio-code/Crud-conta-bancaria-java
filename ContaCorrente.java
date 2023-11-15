//ContaCorrente que estende a classe ContaBancaria
public class ContaCorrente extends ContaBancaria{

    //O construtor da classe ContaCorrente 
    public ContaCorrente(String numeroConta, String agencia, double saldo, Cliente cliente, Banco banco) {
        super(numeroConta, agencia, saldo, cliente, banco);
    }

}
