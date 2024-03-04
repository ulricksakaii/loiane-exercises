package Exercicios02;
import java.util.Scanner;
public class Turnos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Bom dia, digite em qual turno você estuda:");
        String turno = scan.next();

        switch (turno){
            case "M": System.out.println("Bom dia!"); break;
            case "V": System.out.println("Boa tarde!"); break;
            case "N": System.out.println("Boa noite!"); break;
            default : System.out.println("Valor inválido.");
        }

    }
}
