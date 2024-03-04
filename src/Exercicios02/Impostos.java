package Exercicios02;
import java.util.Scanner;
public class Impostos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor/hora: R$");
        double valor = scan.nextDouble();

        System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
        int hora = scan.nextInt();

        double salario = valor * hora;
        double inss = (salario / 100) * 10;
        double fgts = (salario / 100) * 11;

        System.out.println("Salário bruto : " + salario);

        if(salario <= 900){
            System.out.println("( - ) IR (5%): R$0,00");
            System.out.println("( - ) INSS (10%): R$" + inss);
            System.out.println("( - ) FGTS (11%): R$" + fgts);
            System.out.println("Total de descontos: R$" + inss);
            System.out.println("Salário Líquido: R$" + (salario - inss));
        }
        else if(salario > 900 && 1500 >= salario){
            double ir = (salario / 100) * 5;
            System.out.println("( - ) IR (5%): R$" + ir);
            System.out.println("( - ) INSS (10%): R$" + inss);
            System.out.println("( - ) FGTS (11%): R$" + fgts);
            System.out.println("Total de descontos: R$" + (inss + ir));
            System.out.println("Salário Líquido: R$" + (salario - (inss + ir)));
        }
        else if(salario > 1500 && 2500 >= salario){
            double ir2 = (salario / 100) * 10;
            System.out.println("( - ) IR (10%): R$" + ir2);
            System.out.println("( - ) INSS (10%): R$" + inss);
            System.out.println("( - ) FGTS (11%): R$" + fgts);
            System.out.println("Total de descontos: R$" + (inss + ir2));
            System.out.println("Salário Líquido: R$" + (salario - (inss + ir2)));
        }
        else{
            double ir3 = (salario / 100) * 15;
            System.out.println("( - ) IR (10%): R$" + ir3);
            System.out.println("( - ) INSS (10%): R$" + inss);
            System.out.println("( - ) FGTS (11%): R$" + fgts);
            System.out.println("Total de descontos: R$" + (inss + ir3));
            System.out.println("Salário Líquido: R$" + (salario - (inss + ir3)));
        }
    }
}
