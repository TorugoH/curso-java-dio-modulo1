import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int agencia;
        String nomeCliente;
        double saldo;
        String cont;
        System.out.println("Por favor, digite o número do sue agência e pressione ENTER para continuar");
        agencia = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Por favor, digite o número da sua conta e depois pressione ENTER para continuar");
        cont = leitor.nextLine();

        System.out.println("Por favor, informe seu nome completo e pressione ENTER para continuar");
        nomeCliente = leitor.nextLine();

        System.out.println("Pot favor, digite o saldo ");
        saldo = leitor.nextDouble();

        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+cont+"e seu saldo "+saldo+"já está disponível para saque.");


    }
}
