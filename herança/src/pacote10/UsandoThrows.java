package pacote10;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args){

        System.out.println("Entre com um numero decimal");
       try {
           double num = leNumero();
           System.out.println("Você digitou " + num);
       }catch (Exception e){
           System.out.println("Entrada inválida");
           e.printStackTrace();
       }
    }

    public static double leNumero() throws Exception{
        Scanner input = new Scanner(System.in);

        double num = input.nextDouble();
        return num;
    }
}
