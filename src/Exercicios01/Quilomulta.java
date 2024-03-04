package Exercicios01;
import java.util.Scanner;
public class Quilomulta {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o peso do total dos peixes em Quilos: ");
        Double peso = scan.nextDouble();

        if (peso <= 50){
            System.out.println("Você está dentro do parâmetro de peso requerido!");
        }
        else{
            Double multa = (peso - 50) * 4;
            System.out.println(String.format("Você excedeu o limite de peso.\nO valor da multa a pagar é R$%.2f.", multa));
        }
    }
}
