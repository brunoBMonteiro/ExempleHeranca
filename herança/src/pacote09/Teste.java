package pacote09;

public class Teste {
    public static void main(String[] args){
        /*
        // exemplo de chamada sem o método static
        MinhaCalculadora calculadora = new MinhaCalculadora();

        calculadora.soma(3,2,5);
        int soma1 = MinhaCalculadora.soma(10,10,10);

        System.out.println(calculadora.soma(3,2,5));
        System.out.println(soma1);
        */

        // com o static na classe MinhaCalculadora
        MinhaCalculadora.soma(5,5);
        int soma2 = MinhaCalculadora.soma(20,20);

        System.out.println(MinhaCalculadora.soma(5,5));
        System.out.println(soma2);

    }
}
