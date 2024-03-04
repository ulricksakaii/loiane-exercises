package Exercicios01;
import java.util.Scanner;
public class Pesoideal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite qual a sua altura em metros: ");
        Double altura = scan.nextDouble();

        Double pesoideal = (72.7 * altura) - 58;

        System.out.println(String.format("O seu peso ideal referente a sua altura é %.2f...", pesoideal));
    }
}
