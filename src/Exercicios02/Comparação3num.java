package Exercicios02;
import java.util.Scanner;
public class Comparação3num {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = scan.nextInt();

        if(n1 > n2 && n3 < n1){
            System.out.println("O primeiro número é o maior.");
        }else if (n2 > n1 && n3 < n2){
            System.out.println("O segundo número é o maior.");
        }else if (n3 > n1 && n2 <n3){
            System.out.println("O terceiro número é o maior.");
        }else{
            System.out.println("Os três números possuem o mesmo valor.");
        }
    }
}
