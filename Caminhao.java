public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga) {
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Capacidade de carga: %.2f toneladas\n", capacidadeCarga);
    }

    public void exibir(boolean emKg) {
        super.exibir();
        if (emKg) {
            System.out.printf("Capacidade de carga: %.2f kg\n", capacidadeCarga * 1000);
        } else {
            System.out.printf("Capacidade de carga: %.2f toneladas\n", capacidadeCarga);
        }
    }
}
