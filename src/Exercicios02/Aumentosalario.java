package Exercicios02;
import java.util.Scanner;
public class Aumentosalario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o valor do saário do colaborador? R$");
        double ganho = scan.nextDouble();

        if (ganho <= 280){
            double aum1 = (ganho / 100) * 20;
           System.out.println("O seu salário era R$" + ganho);
           System.out.println("O percentual de aumento aplicado será de 20%");
           System.out.println("Convertidos, em R$" + aum1);
           System.out.println("O seu salário atual será de R$" + (ganho + aum1) + ".");
        }
        else if(ganho > 280 && 700 >= ganho){
            double aum2 = (ganho /100) * 15;
            System.out.println("O seu salário era R$" + ganho);
            System.out.println("O percentual de aumento aplicado será de 15%");
            System.out.println("Convertidos, em R$" + aum2);
            System.out.println("O seu salário atual será de R$" + (ganho + aum2) + ".");
        }
        else if (ganho > 700 && 1500 >= ganho){
            double aum3 = (ganho /100) * 10;
            System.out.println("O seu salário era R$" + ganho);
            System.out.println("O percentual de aumento aplicado será de 10%");
            System.out.println("Convertidos, em R$" + aum3);
            System.out.println("O seu salário atual será de R$" + (ganho + aum3) + ".");
        }
        else{
            double aum4 = (ganho / 100) * 5;
            System.out.println("O seu salário era R$" + ganho);
            System.out.println("O percentual de aumento aplicado será de 5%");
            System.out.println("Convertidos, em R$" + aum4);
            System.out.println("O seu salário atual será de R$" + (ganho + aum4) + ".");
        }
    }
}
