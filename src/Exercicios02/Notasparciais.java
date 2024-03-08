package Exercicios02;
import java.util.Scanner;
public class Notasparciais {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;
        
        do{
            System.out.print("Entre com a nota da primeira prova parcial: ");
            double nota1 = scan.nextDouble();

            System.out.print("Entre com a segunda nota parcial:  ");
            double nota2 = scan.nextDouble();

            double media = (nota1 + nota2) / 2;
            if(nota1 <= 10 & nota2 <=10){
                notaValida = true;
                if(media >= 9){
                    System.out.println("Nota: A\nAprovado!");
                }else if(media >= 7.5 && media < 9){
                    System.out.println("Nota : B\nAprovado!");
                }else if(media >= 6 && media < 7.5){
                    System.out.println("Nota : C\nAprovado!");
                }else if(media >= 4 && media < 6){
                    System.out.println("Nota : D\nReprovado!");
                }else if(media >=0 && media < 4){
                    System.out.println("Nota : E\nReprovado!");
                }
            }else{
                System.out.println("Notas inválidas, digite novamente.");
            }
        }while(!notaValida);
    }
}
