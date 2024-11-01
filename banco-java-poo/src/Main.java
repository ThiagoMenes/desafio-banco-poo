public class Main {
    public static void main(String[] args) {
        Cliente thiago = new Cliente();
        thiago.setNome("Thiago");
        Conta contaCorrente = new ContaCorrente(thiago);
        contaCorrente.depositar(100);
        Conta poupanca = new ContaPoupança(thiago);
        contaCorrente.transferir(poupanca, 15);
        Banco banco = new Banco();
        banco.setNome("Bradesco");

        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.listarContas();
    }
}
