package pacote07;

public class TesteCarro {
    public static void main(String[] args){

        Carro van = new Carro();
        Carro carroPasseio = new Carro();

        van.setMarca("Fiat");
        carroPasseio.setMarca("Honda Civic");

        System.out.println(van.getMarca());
        System.out.println(carroPasseio.getMarca());
    }
}
