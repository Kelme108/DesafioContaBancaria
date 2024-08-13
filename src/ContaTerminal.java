import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criar um Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações ao usuário e armazenar as entradas
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer após ler um número

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem com os dados fornecidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}

