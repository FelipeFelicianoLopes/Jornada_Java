public class Caminhao extends Veiculo {
    private double capacidadeCarga; 

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga) {
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Capacidade de carga: %f", capacidadeCarga );
    
    }
}
