package Exercicios02;
import java.util.Scanner;
public class Valorlivro {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro livro: R$");
        double val1 = scan.nextDouble();

        System.out.print("Digite o valor do segundo livro: R$");
        double val2 = scan.nextDouble();

        System.out.print("Digite o valor do terceiro livro: R$");
        double val3 = scan.nextDouble();

        if(val1 < val2 && val3 > val1){
            System.out.println("Você deveria comprar o primeiro livro.");
        }else if(val2 < val1 && val3 > val2){
            System.out.println("Você deveria comprar o segundo livro.");
        }else if(val3 < val1 && val2 > val3){
            System.out.println("Você deveria comprar o terceiro livro.");
        }else{
            System.out.println("Os três livros tem o mesmo preço.");
        }
    }
}
