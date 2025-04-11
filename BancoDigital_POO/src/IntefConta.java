public interface IntefConta {

    void sacar(double valor);

    void depositar(double valor);

    void trasferir(Conta contaDestino, double valor);

    void imprimirExtrato();
}
