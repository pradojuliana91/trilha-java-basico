import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();
        System.out.print("Por favor, digite o nome do cliente: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println();
        System.out.print("Olá " + nome + ", obrigado por criar uma conta em noso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " +
                saldo + " já está disponível para saque.");







        sc.close();
    }
}