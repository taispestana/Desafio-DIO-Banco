public interface IConta {
    void sacar (double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
    void depositar(double valor);
}
