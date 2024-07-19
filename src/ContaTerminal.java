import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Desafio da DIO - Conta bancária via terminal

        //Criando as variáveis e utilizando o Scanner para fazer uma interação com o usuário

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da sua agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o nome da sua agência: ");
        var agência = scanner.next();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextInt();

        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá" + nomeCliente + "seja bem-vindo(a),");
        System.out.println("sua agência é a " + agência + "e seu número " + numeroAgencia + " para conseguir acessar sua conta");
        System.out.println("Seu saldo disponível é de " + saldo + "reais");

      
    }
}
