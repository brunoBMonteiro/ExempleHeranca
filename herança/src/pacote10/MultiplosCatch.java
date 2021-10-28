package pacote10;

public class MultiplosCatch {
    public static void main(String[] args){

      /*
      // Sem tratamento vai dar erro ao dividir 8 por zero
      //Multiplos de 2 e 4
      int[] numeros = {4, 8, 16, 32, 64, 128};

      int[] denominadores = {2, 0, 4, 8, 0};

      for(int i = 0; i < numeros.length; i++){
        System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
      }
      */
        // Sem tratamento vai dar erro ao dividir 8 por zero
        int[] numeros = {4, 8, 16, 32, 64, 128};

        int[] denominadores = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++){
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }catch (ArithmeticException e){
                System.out.println("Erro ao dividir por zero");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exceção ao dividir por uma posição do array inválida");
            }

        }



    }
}
