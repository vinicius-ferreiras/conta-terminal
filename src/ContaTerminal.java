import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite  o numero da agencia:");
        int agencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o numero da conta:");
        String conta = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();

    }
    
}
