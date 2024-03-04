package Exercicios01;
import java.util.Scanner;
public class Soma2numeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int valor1 = scan.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scan.nextInt();

        System.out.println("O valor de " + valor1 + " + " + valor2 + " = " + (valor1 + valor2) );
    }
}
