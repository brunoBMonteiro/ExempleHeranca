package pacote2;

public class Teste {
    public static void main(String[] args){

        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        aluno.setEndereco("Rua 2, Bairro 2");
        professor.setEndereco("Rua 3, Bairro 3");

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();

    }
}
