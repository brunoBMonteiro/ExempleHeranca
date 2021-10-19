public class PassagemValorReferencia {
    public static void main(String[] args){
        Contato contato = new Contato("Contato 1", "9874-321", "contato@gmail.com");

        int valor = 10;

        System.out.println("-------Valores originais------");

        System.out.println(contato);
        System.out.println(valor);

        System.out.println("-------Exemplo 1------");

        testePassagemValorReferencia2(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

        System.out.println("-------Exemplo 2------");


        testePassagemValorReferencia2(valor, contato);
        System.out.println(contato);
        System.out.println(valor);

    }

    private static void testePassagemValorReferencia(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato 2", "3215-788", "contato@gmail.com");
    }

    // tipos primitivos a passagem é por valor, Tipos classe, enum, array: passagem é por referencia
    private static void testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato" + novoValor);
    }

}
