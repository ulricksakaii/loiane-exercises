package Exercicios02;
import java.util.Scanner;
public class Comparaçãonum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro número é maior que o segundo número!");
        }else if(num1 < num2){
            System.out.println("O o segundo número é maior que o primeiro!");
        }else{
            System.out.println("Os dois números tem o mesmo valor!");
        }
    }
}
