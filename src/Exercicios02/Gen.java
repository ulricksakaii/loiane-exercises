package Exercicios02;
import java.util.Scanner;
public class Gen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite F ou M para pedir um sexo: ");
        String gen = scan.next();

        if (gen.equalsIgnoreCase("f")){
            System.out.println("Sexo feminino!");
        }else if(gen.equalsIgnoreCase("m")){
            System.out.println("Sexo masculino!");
        }else{
            System.out.println("Sexo inválido!");
        }

        /*switch(sex){
            case "f":
            case "F": System.out.println("Sexo feminino."); break;
            case "m":
            case "M": System.out.println("O sexo é masculino."); break;
            default : System.out.println("O sexo é inválido."); break;
         }*/
    }

}
