public class Teste {
    public static void main(String[] args){

        Aluno aluno = new Aluno();

        Professor professor = new Professor();

        aluno.setNome("Maria");
        aluno.getNome();

        professor.setSalario(1.800);


        System.out.println("O nome é : " + aluno.getNome());
        System.out.printf("O salario é : " + professor.getSalario());
    }
}
