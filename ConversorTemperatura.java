import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("Escolha o tipo de conversão:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("Ou pressione 0 para sair");
            System.out.print("Digite a opção: ");

            opcao = scanner.nextInt();

            if(opcao == 0) {
                break;
            }
            else if (opcao == 1) {
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
            } else if (opcao == 2) {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5/9;
                System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");
            } else {
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);

        scanner.close();
    }
}
