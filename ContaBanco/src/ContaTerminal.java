import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo(a) ao Dio bank.");

        System.out.println("Para criar sua conta, digite abaixo seu nome:");
        String nomeCliente = sc.next();

        System.out.println("Agora digite o número da agência:");
        String agencia = sc.next();

        System.out.println("Agora digite o número da conta:");
        int numero = sc.nextInt();

        System.out.println("Por fim, digite o saldo:");
        double saldo = sc.nextDouble();

        Conta conta = new Conta(nomeCliente, agencia, numero, saldo);

        System.out.println(conta.toString());

        sc.close();

    }
}
