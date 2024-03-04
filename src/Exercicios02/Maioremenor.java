package Exercicios02;
import java.util.Scanner;
import java.lang.Math;
public class Maioremenor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = scan.nextInt();

        int menor1 = Math.min(n1, n2);
        int menor = Math.min(menor1, n3);

        int maior1 = Math.max(n1, n2);
        int maior = Math.max(maior1, n3);

        System.out.println("O menor número é " + menor + "\nO maior número é " + maior);


    }
}
