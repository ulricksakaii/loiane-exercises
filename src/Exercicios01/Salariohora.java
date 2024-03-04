package Exercicios01;
import java.util.Scanner;
public class Salariohora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário por hora: R$");
        Double salario = scan.nextDouble();

        System.out.println("\nDigite a quantidade de horas trabalhadas no mês: ");
        int horas = scan.nextInt();

        System.out.println(String.format("\nO seu salário mensal é igual á R$%.2f", (salario * horas)));
    }
}
