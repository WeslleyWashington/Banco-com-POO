public class Main {

    public static void main(String[] args) {

        Cliente weslley = new Cliente();
        weslley.setNome("Weslley");


        Conta cc = new ContaCorrente(weslley);
        cc.depositar(50000);

        Conta poupanca = new ContaPoupanca(weslley);
        cc.transferir(50000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
