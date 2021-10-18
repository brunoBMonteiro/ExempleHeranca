public class Ferrari {
    public static void main(String[] args){
        Veiculo ferrari = new Veiculo();

        ferrari.ano = 2014;
        ferrari.cor = "Vermelho";

        System.out.println("Carro: Ferrari");
        System.out.println("Ano: " + ferrari.ano);
        System.out.println("Ano: " + ferrari.cor);
        ferrari.ligar();
        ferrari.acelerar();
    }
}
