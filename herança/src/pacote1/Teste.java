package pacote1;

public class Teste {
    public static void main(String[] args){
        // HERANÇA
        /*
        // Instanciando objetos
        pacote1.Pessoa pessoa = new pacote1.Pessoa();
        pacote1.Aluno aluno = new pacote1.Aluno();
        pacote1.Professor professor = new pacote1.Professor();

        // Objeto instanciado chamando métodos
        aluno.setNome("Maria");
        aluno.getNome();
        professor.setSalario(1.800);
        pessoa.setNome("Bruno");
        pessoa.setNome("João");


        System.out.println("===============================");
        System.out.println("O nome é : " + aluno.getNome());
        System.out.println("O salario é : " + professor.getSalario());
        System.out.println("Nome da pessoa :" + pessoa.getNome());
        System.out.println("===============================");
        */

        // POLIMORFISMO - Sobrecarga de métodos==================

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, Bairro 1");
        aluno.setEndereco("Rua 2, Bairro 2");
        professor.setEndereco("Rua 3, Bairro 3");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
