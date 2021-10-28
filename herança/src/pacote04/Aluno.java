package pacote04;

public class Aluno  {

    private String curso;
    private double[] notas;

    public Aluno(double[] notas, String curso) {
        this.notas = notas;
        this.curso = curso;
    }

    public Aluno() {

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
        //super.
        //this.
    }

    public void verificaAcesso(){
        //this.
        //super.
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do aluno: ";
        return s;
    }

    public void imprimirEtiquetaEndereco(){
        System.out.println("Imprimir endereço do aluno: ");
        System.out.println(this.obterEtiquetaEndereco());
    }


    // sem o toString ele retorna o local da memória
    public String toString(){
       String s = curso + "\n";
       for(double nota : notas){
           s += nota + " ";
       }
       return s;
    }
}
