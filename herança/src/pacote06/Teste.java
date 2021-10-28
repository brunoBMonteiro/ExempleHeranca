package pacote06;

import pacote1.Pessoa;

public class Teste {
    public static void main(String[] args){

        // Downcasting
        // exemplo ok
        // retorno do método pode referenciar String
        Object obj1 = obterString();
        String s1 = (String) obj1;
        System.out.println(s1);

        // Upcasting
        // exemplo 2 ok
        // referenciando uma string diretamente
        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        //exemplo 3
        // falha em tempo de execução  obj3 não referencia uma String
        Object obj3 = new Object();
        String s3 = (String) obj3;

        // exemplo 4
        // falha em tempo de compilação
        // obj4 nunca referencia String já que retorno do método é int
        Object obj4 = obterInteiro();
        String s4 = (String) obj4;
    }

    // Retornando uma string
    public static String obterString(){
        return "minha String";
    }

    public static int obterInteiro(){
        return 1;
    }

}
