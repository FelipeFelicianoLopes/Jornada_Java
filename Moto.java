public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, double preco, int cilindradas) {
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Cilindradas: " + cilindradas);
    }

    public void exibir(boolean emCavalos) {
        super.exibir();
        if (emCavalos) {
            System.out.printf("Potência: %.2f cv\n", cilindradas * 1.77);
        } else {
            System.out.println("Cilindradas: " + cilindradas);
        }
    }
}


