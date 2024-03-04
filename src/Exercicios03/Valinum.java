package Exercicios03;
import java.util.Scanner;
public class Valinum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        boolean notaValida = false;

        do{ 
            System.out.println("Entre com uma nota: ");
            double nota = scan.nextDouble();
            if(nota <= 10 && nota >= 0){
                notaValida = true;
                System.out.print("Você digitou " + nota);
            }else{
                System.out.println("Nota inválida, tente novamente.");
            }
        }while(!notaValida);
        
    }
}       
    
