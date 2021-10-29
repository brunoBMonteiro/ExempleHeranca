package pacote12;

public class PassagemValorReferencia {
    public static void main(String[] args){
        Contato contato = new Contato("Contato 1", "1234-567", "contato@gmail.com");
        int valor = 10;

        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia(valor, contato);

        System.out.println(contato);
        System.out.println(valor);


        // Modifico os valores que estão dentro do heap
        testePassagemValorReferencia2(valor, contato);

        System.out.println(contato);
        System.out.println(valor);
    }

    private static void testePassagemValorReferencia(int valor, Contato contato){

        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato 2", "12324-9879", "contato@email.com");
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato" + novoValor);
    }


}
