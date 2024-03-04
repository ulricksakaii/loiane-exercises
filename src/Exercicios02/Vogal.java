package Exercicios02;
import java.util.Scanner;
public class Vogal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scan.next();

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida!");
        }
        else {
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) {

                System.out.println("A letra é uma vogal!");
            } else {
                System.out.println("A letra é uma consoante!");
            }
        }
        /*switch(letra){
            case "A" :
            case "a" : System.out.println("A letra A é uma vogal."); break;
            case "E" :
            case "e" : System.out.println("A letra E é uma vogal."); break;
            case "I" :
            case "i" : System.out.println("A letra I é uma vogal."); break;
            case "O" :
            case "o" : System.out.println("A letra O é uma vogal."); break;
            case "U" :
            case "u" : System.out.println("A letra U é uma vogal."); break;
            default : System.out.println("A letra é uma consoante.");
        }*/
    }
}
