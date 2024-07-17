import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Desafio da DIO - Conta bancária via terminal

        //Criando as variáveis

        int numero = Integer.valueOf(args[0]);
        //armazena o número da agência do cliente
        String nomeCliente = args[1];
        //armazena o nome do cliente
        String agencia = args[2];
        //armazena o nome da agência do cliente
        double saldo = Integer.valueOf(args[3]);
        //armazena o saldo que o cliente possui
    }
}
