package Exercicios02;
import java.util.Scanner;
public class Posouneg {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();

        if (num >= 0){
            System.out.println("O número " + num + " é positivo.");
        }else{
            System.out.println("O número " + num + " é negativo.");
        }
    }
}
