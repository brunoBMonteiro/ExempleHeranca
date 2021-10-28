package pacote08;

public class NumInteiros {

    public int soma(int num1, int num2){
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public double soma(double num1, double num2){
        return num1 + num2;
    }

    public int soma(int[] vetoresInteiros){
        int total= 0;

        for(int i = 0; i < vetoresInteiros.length; i++){
            total += vetoresInteiros[i];
        }

        return total;
    }
}
