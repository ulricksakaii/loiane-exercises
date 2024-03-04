package Exercicios01;
import java.util.Scanner;
public class Pesoidealgen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua altura em metros: ");
        Double altura = scan.nextDouble();

        System.out.print("Digite o seu sexo: ");
        String sexo = scan.next();

        Double pesohomem = (72.7 * altura) - 58;
        Double pesomulher = (62.1 * altura) -44.7;

        if (sexo == "Mulher") {
            System.out.println(String.format("O seu peso ideal é: %.1f", pesomulher));

        }else {
            System.out.println(String.format("O seu peso ideal é: %.1f", pesohomem));
        }
    }
}
