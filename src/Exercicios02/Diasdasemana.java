package Exercicios02;
import java.util.Scanner;
public class Diasdasemana {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Olá, tudo bem?\nDigite um número de 1 ao 7: ");
        int dia = scan.nextInt();

        switch(dia){
            case 1: System.out.println("Domingo!"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça!"); break;
            case 4: System.out.println("Quarta-feira!"); break;
            case 5: System.out.println("Quinta-feira!"); break;
            case 6: System.out.println("Sexta-feira!"); break;
            case 7: System.out.println("Sábado!"); break;
            default: System.out.println("Número inválido!"); break;
        }
    }
}
