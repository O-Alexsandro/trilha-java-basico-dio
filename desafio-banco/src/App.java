public class App {
   public static void main(String[] args) {

    Conta cc = new ContaCorrente();
    cc.depositar(100);
    cc.emprestimo(1000);


    Conta cp = new ContaPoupanca();
    cc.transferir(100, cp);
    cc.imprimirExtrato();
    cp.imprimirExtrato();
   }
}
