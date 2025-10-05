public class Carro extends Veiculo {
    private int nPortas;

    public Carro(String placa, String marca, double preco, int nPortas) {
        super(placa, marca, preco);
        this.nPortas = nPortas;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Número de portas: " + nPortas);
    }

    public void exibir(boolean mostrarPortas) {
        super.exibir();
        if (mostrarPortas) {
            System.out.println("Número de portas: " + nPortas);
        }
    }
}

