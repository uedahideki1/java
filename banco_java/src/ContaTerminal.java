import java.util.Scanner; // Importe a classe Scanner para poder usar para ler a entrada do usuário

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do usuário:");
        int usuario = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o nome do usuário:");
        String nome = scanner.next();

        System.out.println("Digite o saldo do usuário:");
        double saldo = scanner.nextDouble();

        // Imprima os valores lidos com uma mensagem mais clara e bem formatada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + usuario + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        // Não se esqueça de fechar o scanner depois de usá-lo
        scanner.close();
    }
}
