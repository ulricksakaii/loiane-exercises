package Exercicios02;
import java.util.Scanner;
public class Ladostriangulo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor de um dos lados: ");
        double lado1 = scan.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double lado2 = scan.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double lado3 = scan.nextDouble();

         if(lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado1 + lado3 > lado2){
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("O triângulo é Equilátero.");
            }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("O triangulo é Isóceles.");
            }else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
                System.out.println("O triangulo é Escaleno.");
            }
            }else{
                System.out.println("Essas medidas não formam um triângulo.");
            }



    }
}
