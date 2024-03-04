package Exercicios02;
import java.util.Scanner;
public class Nota2provas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a nota da primeira prova: ");
        double nota1 = scan.nextDouble();

        System.out.print("Entre com a nota da segunda prova: ");
        double nota2 = scan.nextDouble();

        double m = (nota1 + nota2) / 2;

        if (m < 7){
            System.out.println("Você foi reprovado!");
        }else if(m >= 7 && 10 > m){
            System.out.println("Você foi aprovado!");
        }else if (10 == m){
            System.out.println("Voce foi aprovado com distinção!");
        }else{
            System.out.println("Você digitou um valor inválido!");
        }
    }
}
