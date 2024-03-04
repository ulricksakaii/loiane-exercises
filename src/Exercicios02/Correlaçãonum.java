package Exercicios02;
import java.util.Scanner;
import java.lang.Math;
public class Correlaçãonum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scan.nextInt();

        System.out.print("Digite um segundo número: ");
        int n2 = scan.nextInt();

        System.out.print("Digite um terceiro número: ");
        int n3 = scan.nextInt();

        int menor1 = Math.min(n1, n2);
        int menor = Math.min(menor1, n3);

        int maior1 = Math.max(n1, n2);
        int maior = Math.max(maior1, n3);

        System.out.println(menor);
        if(n1 > menor && maior > n1){
            System.out.println(n1);
        }else if(n2 > menor && maior > n2){
            System.out.println(n2);
        }else if(n3 > menor && maior > n3){
            System.out.println(n3);
        }
        System.out.println(maior);
    }
}
