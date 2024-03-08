package Exercicios02;
import java.util.Scanner;
import java.lang.Math;
public class Raiz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos calcular uma raiz de segundo grau!");

        System.out.print("Entre com o valor de A: ");
        int a = scan.nextInt();
        
        if(a == 0){
            System.out.println("A equação não será de segundo grau com este valor de A.");
        }else{
            System.out.print("Entre com o valor de B: ");
            int b = scan.nextInt();
        
            System.out.print("Entre com o valor de C: ");
            int c = scan.nextInt();
            
            double delta = Math.pow(b, 2) - ( a * c * 4);

            if(delta < 0){
                System.out.println("O delta calculado foi negativo.\nA equação não possui raizes reais.");
            }else{
                if(delta == 0){
                    System.out.println("A equação possui apenas uma raiz real.");

                    double x = (-b + 0) / 2 * a;

                    System.out.println(String.format("A equação possui a raiz real: %.0f ", x));
                }else{
                    System.out.println("A equação possui duas raizes reais.");
                    
                    double x = (-b + Math.sqrt(delta) / (2 * a));

                    double y = (-b - Math.sqrt(delta) / (2* a));
    
                    System.out.println(String.format("O primeira raiz real equivale a %.0f.\nE a segunda equivale a: %.0f.", x, y));
                }
 
            }

            


        }
    }
}
