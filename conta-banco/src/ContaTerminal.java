import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;    

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Insira o seu número número:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.err.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", sua conta é: " + numero + " e seu saldo é: " + saldo + "e já está disponível para saque");

    }
}
