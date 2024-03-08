package Exercicios02;
import java.util.Scanner;
public class Anobissexto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scan.nextInt();

        if(ano % 4 == 0 ){
            System.out.println("O ano " + ano + " é bissexto.");
        }else{
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}
