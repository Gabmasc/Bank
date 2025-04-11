public class Main {
    public static void main(String[] args) {

        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel Mascarenhas");
        Conta contac = new ContaCorrente(gabriel);
        Conta contap = new ContaPoupanca(gabriel);

        contac.depositar(1000);
        contac.trasferir(contap, 500);

        contac.imprimirExtrato();
        contap.imprimirExtrato();
    }
}