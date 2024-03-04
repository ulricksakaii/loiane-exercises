package Exercicios01;
import java.util.Scanner;
public class Médianotas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da primeira prova: ");
        Double valor1 = scan.nextDouble();

        System.out.print("Digite o valor da segunda prova: ");
        Double valor2 = scan.nextDouble();

        System.out.print("Digite o valor da terceira prova: ");
        Double valor3 = scan.nextDouble();

        System.out.print("Digite o valor da quarta prova: ");
        Double valor4 = scan.nextDouble();

        Double resultado = (valor1 + valor2 + valor3 + valor4) / 4;
        System.out.print("A média dessas 4 provas é " + resultado);
    }
}
