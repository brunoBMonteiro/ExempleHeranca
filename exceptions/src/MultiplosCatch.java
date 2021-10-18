public class MultiplosCatch {
    public static void main(String[] args){

        // multiplos de 2 e 4
        int[] numeros = {4, 8, 16 , 32, 64, 128};

        // denominadores
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i] / denominadores[i]));
        }
    }
}
