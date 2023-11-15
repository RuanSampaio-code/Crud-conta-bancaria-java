import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// classe principal que representa a interface gráfica
public class CadastroContasGUI {

    // criar uma instância do objeto GerenciadorImplementa
    private GerenciadorImplementa gerenciador; 
    
    //Construtor da classe CadastroContasGUI
    public CadastroContasGUI() {
        
        //Cria uma nova instância (objeto) da class
        gerenciador = new GerenciadorImplementa();

        //configuração da janela principal da interface gráfica.
        JFrame frame = new JFrame("Cadastro de Contas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        //Container
        JPanel panel = new JPanel();
        frame.add(panel);

        //Organiza os componentes
        panel.setLayout(new FlowLayout());

        // Tamanho personalizado para os botões
        Dimension buttonSize = new Dimension(200, 30);

        //o vários botões em Java Swing
        JButton btnCadastrarCorrente = new JButton("1. Cadastrar Conta Corrente");
        btnCadastrarCorrente.setPreferredSize(buttonSize);
        JButton btnCadastrarPoupanca = new JButton("2. Cadastrar Conta Poupança");
        btnCadastrarPoupanca.setPreferredSize(buttonSize);
        JButton btnListarContas = new JButton("3. Listar Contas");
        btnListarContas.setPreferredSize(buttonSize);
        JButton btnAlterarConta = new JButton("4. Alterar Conta");
        btnAlterarConta.setPreferredSize(buttonSize);
        JButton btnExcluirConta = new JButton("5. Excluir Conta");
        btnExcluirConta.setPreferredSize(buttonSize);
        JButton btnSair = new JButton("6. Sair");
        btnSair.setPreferredSize(buttonSize);

        //adicionando botões a um painel 
        panel.add(btnCadastrarCorrente);
        panel.add(btnCadastrarPoupanca);
        panel.add(btnListarContas);
        panel.add(btnAlterarConta);
        panel.add(btnExcluirConta);
        panel.add(btnSair);

        //evetos da ação de clicar no botao de cadastrar conta
        btnCadastrarCorrente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                //painel e várias caixas de texto
                JPanel inputPanel = new JPanel(new GridLayout(5, 2));
                JTextField numContaField = new JTextField();
                JTextField agenciaField  = new JTextField();
                JTextField saldoField = new JTextField();
                JTextField clienteField = new JTextField();
                JTextField bancoField = new JTextField();

                //adicionando rótulos (labels) e campos de entrada de texto 
                inputPanel.add(new JLabel("Número da Conta:"));
                inputPanel.add(numContaField);
                inputPanel.add(new JLabel("Agência:"));
                inputPanel.add(agenciaField);
                inputPanel.add(new JLabel("Saldo:"));
                inputPanel.add(saldoField);
                inputPanel.add(new JLabel("Cliente:"));
                inputPanel.add(clienteField);
                inputPanel.add(new JLabel("Banco:"));
                inputPanel.add(bancoField);
                
                //diálogo de confirmação para coletar informações do usuário
                int result = JOptionPane.showConfirmDialog(null, inputPanel, "Cadastro de Conta Corrente",
                JOptionPane.OK_CANCEL_OPTION);

                //ação com base na escolha do usuário 
                if (result == JOptionPane.OK_OPTION) {
                    // Variáveis são usadas para processar os dados coletados
                    String numConta = numContaField.getText();
                    String numAgencia = agenciaField.getText();
                    String saldoInput = saldoField.getText(); // Armazenar a entrada como string 
                    String nomecliente = clienteField.getText();
                    String nomebanco = bancoField.getText();
                
                    // Validar se saldo contém apenas números
                    if (saldoInput.matches("\\d+(\\.\\d+)?")) { 
                        
                        // Converter a entrada de saldo para um valor double
                        double valorSaldo = Double.parseDouble(saldoInput);
                
                        // O método do gerenciador para adicionar a conta corrente
                        gerenciador.adicionarConta(new ContaCorrente(numConta, numAgencia, valorSaldo, new Cliente(nomecliente), new Banco(nomebanco)));
                        JOptionPane.showMessageDialog(null, "Conta Corrente cadastrada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: Digite um valor numérico válido para o saldo.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } 
               
            }
        });

        //evetos da ação de clicar no botao de cadastrar conta Poupança
        btnCadastrarPoupanca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ////painel e várias caixas de texto
                JPanel inputPanelcp = new JPanel(new GridLayout(5, 2));
                JTextField numContaFieldcp = new JTextField();
                JTextField agenciaFieldcp  = new JTextField();
                JTextField saldoFieldcp = new JTextField();
                JTextField clienteFieldcp = new JTextField();
                JTextField bancoFieldcp = new JTextField();

                //adicionando rótulos (labels) e campos de entrada de texto 
                inputPanelcp.add(new JLabel("Número da Conta:"));
                inputPanelcp.add(numContaFieldcp);
                inputPanelcp.add(new JLabel("Agência:"));
                inputPanelcp.add(agenciaFieldcp);
                inputPanelcp.add(new JLabel("Saldo:"));
                inputPanelcp.add(saldoFieldcp);
                inputPanelcp.add(new JLabel("Cliente:"));
                inputPanelcp.add(clienteFieldcp);
                inputPanelcp.add(new JLabel("Banco:"));
                inputPanelcp.add(bancoFieldcp);

                //diálogo de confirmação para coletar informações do usuário
                int result = JOptionPane.showConfirmDialog(null, inputPanelcp, "Cadastro de Conta Poupança",
                JOptionPane.OK_CANCEL_OPTION);

                //ação com base na escolha do usuário 
                if (result == JOptionPane.OK_OPTION) {
                    String numContacp = numContaFieldcp.getText();
                    String numAgenciacp = agenciaFieldcp.getText();
                    double valorSaldocp = Double.parseDouble(saldoFieldcp.getText());
                    String nomeclientecp = clienteFieldcp.getText();
                    String nomebancocp = bancoFieldcp.getText();

                    //o método do gerenciador para adicionar a conta corrente
                    gerenciador.adicionarConta(new ContaPoupanca(numContacp, numAgenciacp, valorSaldocp, new Cliente(nomeclientecp), new Banco(nomebancocp)));
                    JOptionPane.showMessageDialog(null, "Conta Poupança cadastrada com sucesso!");
                }
                

            }
        });

        //botão para Ler as contas cadastradas    
        btnListarContas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // gerenciador para listar as contas
                gerenciador.exibirContasNaInterfaceGrafica();
            }
        });

        //botão para alterar as contas cadastradas
        btnAlterarConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                

                String contaAntiga = JOptionPane.showInputDialog("Digite o número da Conta que deseja alterar:");
                String agencianew =  JOptionPane.showInputDialog("Digite a nova agencia:");
                double saldonew = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo saldo:"));
                String clienteNew = JOptionPane.showInputDialog("Digite a novo Cliente:");
                String bancoNew = JOptionPane.showInputDialog("Digite o novo banco:");
                
                gerenciador.alterarConta(contaAntiga, new ContaBancaria(contaAntiga, agencianew, saldonew,  new Cliente(clienteNew), new Banco(bancoNew))); // Preencha com os dados corretos
            }
        });


        // botão para Remover as contas cadastradas
        btnExcluirConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String conta = JOptionPane.showInputDialog("Digite o número da Conta que deseja excluir:");
                gerenciador.removerConta(conta);
            }
        });

        //botão para sair do programa
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    //inicia a execução do programa
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroContasGUI();
            }
        });
    }
}
