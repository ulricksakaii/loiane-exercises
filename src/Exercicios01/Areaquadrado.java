package Exercicios01;
import java.util.Scanner;
import java.lang.Math;
public class Areaquadrado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor em centímetros da base do quadrado... ");
        Double base = scan.nextDouble();

        Double area = Math.pow(base, 2);

        System.out.println(String.format("A área do quadrado equivale á %.2f" + " centímetros!", area));
        System.out.println(String.format("O dobro da área do círculo é igual a %.2f", (area * 2)));

    }
}
