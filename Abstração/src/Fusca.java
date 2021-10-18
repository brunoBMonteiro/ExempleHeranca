public class Fusca {
    public static void main(String[] args){
        Veiculo fusca = new Veiculo();

        fusca.ano = 1974;
        fusca.cor = "Azul";

        System.out.println("Carro: Fusca");
        System.out.println("Ano: " + fusca.ano);
        System.out.println("Ano: " + fusca.cor);
        fusca.ligar();
        fusca.acelerar();
        fusca.desligar();
    }
}
