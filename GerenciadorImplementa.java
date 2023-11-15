import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GerenciadorImplementa implements Gerenciador{
    
    //lista
    private List<ContaBancaria> contas = new ArrayList<>();
    
    //adicionar
    @Override
    public void adicionarConta(ContaBancaria conta) {
        // TODO Auto-generated method stub
        
        contas.add(conta);
        
    }



    //alterar
    @Override
    public void alterarConta(String numero, ContaBancaria novaConta) {
        // TODO Auto-generated method stub
        if (contas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nao há contas para ser alteradas.");
            return;
        }
        for (int i = 0; i < contas.size(); i++) {
            ContaBancaria conta = contas.get(i);
            if (conta.getNumeroConta().equals(numero)) {
                // contas.set(i, novaConta)
                
                conta.alterarConta(numero, novaConta);
                conta.setNumeroConta(novaConta.getNumeroConta());
                conta.setAgencia(novaConta.getAgencia());
                conta.setSaldo(novaConta.getSaldo());
                conta.setCliente(novaConta.getCliente());
                conta.setBanco(novaConta.getBanco());
                

                //System.out.println("Conta bancária alterada com sucesso.");
                return;
            } 
        }
        
    }

    //exibir
    @Override
    public void exibirContasNaInterfaceGrafica() {
        // TODO Auto-generated method stub
        JFrame listaContasFrame = new JFrame("Lista de Contas Bancárias");
        listaContasFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        listaContasFrame.setSize(600, 400);

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Número da Conta");
        tableModel.addColumn("Agência");
        tableModel.addColumn("Saldo");
        tableModel.addColumn("Cliente");
        tableModel.addColumn("Banco");

        JTable tabelaContas = new JTable(tableModel); 
        JScrollPane scrollPane = new JScrollPane(tabelaContas);

        for (ContaBancaria conta : contas) {
            String numeroConta = conta.getNumeroConta();
            String agencia = conta.getAgencia();
            double saldo = conta.getSaldo();
            String nomeCliente = conta.getCliente().getNome();
            String nomeBanco = conta.getBanco().getNome();

            tableModel.addRow(new Object[]{numeroConta, agencia, saldo, nomeCliente, nomeBanco});
        }

        listaContasFrame.add(scrollPane);
        listaContasFrame.setVisible(true);
        

        
    }

    //remover
    @Override
    public void removerConta(String numero) {
        // TODO Auto-generated method stub
        //validação caso nao tenha nada cadastrado
        if (contas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nao existem contas cadastradas.");
            return;
        }
        for (ContaBancaria conta : contas) {
            
            if (conta.getNumeroConta().equals(numero)) {
                contas.remove(conta);
                JOptionPane.showMessageDialog(null, "Conta deletada com sucesso");
                return;
            }
            //Validação caso digite uma conta que nao foi cadastradas
            else{
                JOptionPane.showMessageDialog(null, "Esta conta nao foi cadastrada.");
            }
        }
        
    }

    
    
}
