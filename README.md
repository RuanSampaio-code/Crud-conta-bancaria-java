# Crud-conta-bancaria-java
### Programa de Gerenciamento de Contas Bancárias

### **Início do Programa:**

Apresenta um menu com as opções disponíveis:

1. Cadastrar Conta Corrente
2. Cadastrar Conta Poupança
3. Listar Contas
4. Alterar Conta
5. Excluir Conta
6. Sair

### **Opção 1: Cadastrar Conta Corrente:**

- Solicita as informações necessárias para cadastrar uma conta corrente, como número da conta, agência, saldo e cliente.
- Cadastra a conta corrente com as informações fornecidas.

### **Opção 2: Cadastrar Conta Poupança:**

- Solicita as informações necessárias para cadastrar uma conta poupança, como número da conta, agência, saldo e cliente.
- Cadastra a conta poupança com as informações fornecidas.

### **Opção 3: Listar Contas:**

- Lista todas as contas cadastradas, exibindo informações como número da conta, agência, saldo, cliente e banco.

### **Opção 4: Alterar Conta:**

- Solicita o número da conta que deseja alterar.
- Solicita as novas informações e atualiza a conta correspondente.

### **Opção 5: Excluir Conta:**

- Solicita o número da conta que deseja excluir.

### Classes

### **2.1 Banco:**

- A classe "Banco" representa um banco bancário com atributos e métodos.
    - Nome: Variável de instância que armazena o nome do banco.
    - `Banco(String nome)`: Construtor da classe.
    - `getNome()`: Método get que retorna o valor da variável nome.
    - `setNome(String nome)`: Método set que atribui um novo nome ao banco.

### **2.2 Cliente:**

- A classe "Cliente" representa um cliente em um sistema bancário.
    - Nome: Variável de instância privada que contém o nome do cliente.
    - `Cliente(String nome)`: Construtor da classe.
    - `getNome()`: Método get para a variável nome.
    - `setNome(String nome)`: Método set para a variável nome.

### **2.3 ContaBancaria:**

- A classe "ContaBancaria" herda da interface "Gerenciador" e representa uma conta bancária.
    - Métodos set e get para cada variável de instância.
    - Implementação de métodos abstratos da interface "Gerenciador".
    - Construtor para criar objetos "ContaBancaria".

### **2.4 ContaCorrente:**

- Subclasse de "ContaBancaria" que herda métodos e atributos da superclasse.

### **2.5 ContaPoupanca:**

- Subclasse de "ContaBancaria" que herda métodos e atributos da superclasse.

### **2.6 GerenciadorImplementa:**

- Implementa a interface Gerenciador com métodos para adicionar, alterar, exibir e remover contas bancárias.
    - `adicionarConta`: Adiciona uma nova conta bancária à lista de contas.
    - `alterarConta`: Busca e altera informações de uma conta existente.
    - `exibirContasNaInterfaceGrafica`: Cria uma interface gráfica com informações das contas.
    - `removeConta`: Remove uma conta bancária da lista.

### Interface

### **3.1 Gerenciador:**

- Interface que define operações sem implementação.
    - `adicionarConta(ContaBancaria conta)`: Adiciona uma nova conta bancária à lista.
    - `exibirContasNaInterfaceGrafica()`: Exibe informações das contas na interface gráfica.
    - `alterarConta(String numero, ContaBancaria novaConta)`: Altera informações de uma conta existente.
    - `removerConta(String numero)`: Remove uma conta bancária da lista.

### **3.2 CadastroContasGUI:**

- Aplicação com uma interface gráfica simples que utiliza Swing.
    - Permite cadastrar contas corrente e poupança, listar contas, alterar dados e excluir contas.
