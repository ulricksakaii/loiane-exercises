package Exercicios01;
import java.util.Scanner;
public class Conversãometros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantos metros deseja converter: ");
        Double metros = scan.nextDouble();

        System.out.print("A quantidade de " + metros + " em centímetro é igual a " + (metros * 100));
    }
}
