public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente){
        super (cliente);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupanca ***");
        super.imprimirInfosComuns();
    }
}
