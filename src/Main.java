//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente tais = new Cliente();
        tais.setNome("Tais");

        Conta cc = new ContaCorrente(tais);
        Conta cp = new ContaPoupanca(tais);

        cc.depositar(100);
        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cc.consultarSaldo();

        cp.imprimirExtrato();
        cp.consultarSaldo();
    }
}