package pacote1;
// public class pacote1.Professor extends pacote1.Pessoa{
import pacote1.Pessoa;

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

    //==========SOBRECARGA METODO EXEMPLO===============
    /*
    public String obterEtiquetaEndereco(){
        String s = "Endereço do professor: ";
        s += this.getEndereco();

        return s;
    }
     */


}
