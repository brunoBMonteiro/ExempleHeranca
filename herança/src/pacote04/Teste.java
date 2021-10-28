package pacote04;

public class Teste {
    public static void main(String[] args){

         Aluno aluno = new Aluno();

         aluno.setCurso("Ciência da Computação");

         double[] notas = {10, 9.5, 8.2, 7};

         aluno.setNotas(notas);

         System.out.println(aluno);

         /*
         String s1 = "asdsadsad";
         String s2 = "asdsadsad";

         System.out.println(s1.equals(s2));

          */
    }
}
