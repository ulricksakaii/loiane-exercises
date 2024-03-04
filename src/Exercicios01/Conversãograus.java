package Exercicios01;
import java.util.Scanner;
public class Conversãograus {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*System.out.print("Digite quantos graus Farenheit deseja converter: ");
        Double faren = scan.nextDouble();

        Double ceusius = (5 * (faren - 32) /9);
        System.out.println(String.format("Os %.1f graus Farenheit, convertidos equivalem á %.1f graus Ceusius.", faren, ceusius));*/

        System.out.print("Digite quantos graus deseja converter para Farenheit:  ");
        Double ceusius = scan.nextDouble();

        Double faren = (ceusius * 1.8) +32;
        System.out.println(String.format("%.1f equivale á %.1f graus farenheit.", ceusius, faren));
    }
}
