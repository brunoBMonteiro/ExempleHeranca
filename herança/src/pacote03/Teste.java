package pacote03;

public class Teste {
    public static void main(String[] args){

    System.out.println(Constantes.URL_MEU_GITHUB);
    Constantes.URL_MEU_GITHUB = "asdfcvedas";

    System.out.println(Constantes.URL_MEU_TESTE);

    /*
    int total = 1;
    total += 1;
    System.out.println(total);
    */

        final int TOTAL = 1;
        //Como constante é sempre constante não posso alterar
        //total += 1;
        System.out.println(TOTAL);
    }
}
