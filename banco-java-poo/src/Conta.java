public class Conta implements IConta{
    private int agencia;
    private int numeroConta;
    private double saldo;

    @Override
    public void sacar(double valor) {
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(Conta contaDestino, double valor) {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }



}
