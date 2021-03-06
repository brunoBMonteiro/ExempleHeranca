package pacote2;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;


    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public String getNomeCurso() {

        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {

        this.nomeCurso = nomeCurso;
    }

    public double calculaSalarioLiquido(){

        return 0;
    }

    //Sobreescrita
    public String obterEtiquetaEndereco(){
        String s = "Endereço do professor: ";
        s += this.getEndereco();

        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimir endereço do professor: ");
        System.out.println(this.obterEtiquetaEndereco());
    }

}
