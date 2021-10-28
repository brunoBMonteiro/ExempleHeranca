package pacote10;

public class Excecao {
    public static void main(String[] args) {
        //Sem tratamento
        int[] vetor = new int[4];

        System.out.println("Antes da exception");

        vetor[4] = 1;

        System.out.println("Esse texto não será impresso");

        /*

        // Com tratamento
        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Esse texto não será impresso");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um índice do vetor que não existe");
        }
        System.out.println("Mostrando que será executado após exception");
        */
    }
}
