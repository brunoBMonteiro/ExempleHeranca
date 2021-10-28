package pacote1;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    // Modificadores de acesso
     String nomeVisibilidade;

    // adicionando atributo casa para ver que agora aluno e professor tem acesso ao método get e set
    //private String casa;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, String cpf) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    //   Desmarcar métodos acesso ao método get e set
    /*
    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
     */

    //====================POLIMORFISMO==================================

    public String obterEtiquetaEndereco(){
        return endereco;
    }

}
