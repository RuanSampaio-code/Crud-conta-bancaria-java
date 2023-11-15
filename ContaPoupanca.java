//ContaPoupanca que estende a classe ContaBancaria,
public class ContaPoupanca extends ContaBancaria {
    //construtor
    public ContaPoupanca(String numeroConta, String agencia, double saldo, Cliente cliente, Banco banco) {
        super(numeroConta, agencia, saldo, cliente, banco);
    }

}
