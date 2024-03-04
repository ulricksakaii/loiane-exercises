package Exercicios01;
import java.util.Scanner;
import java.lang.Math;
public class Contas3numeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = scan.nextInt();

        System.out.print("\nDigite outro número inteiro: ");
        int numero2 = scan.nextInt();

        System.out.print("\nAgora, digite um número real: ");
        double numero3 = scan.nextDouble();

        int resultado1 = (numero1 * 2) * (numero2 / 2);
        double resultado2 = (numero1 * 3) + numero3;
        double resultado3 = Math.pow(numero3, 3);

        System.out.println("O produto do dobro do primeiro com a metade do segundo é igual á " + resultado1 + ".");
        System.out.println(String.format("A soma do triplo do primeiro com o terceiro é igual á %.2f.", resultado2));
        System.out.println(String.format("O resultado do terceiro elevado ao cubo é igual á %.2f.", resultado3));

    }
}
