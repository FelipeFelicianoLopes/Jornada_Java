public class Veiculo {
    protected String placa, marca;
    protected double preco;

    public Veiculo(String placa, String marca, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public void exibir() {
        System.out.printf("Placa: %s\nMarca: %s\nPreço: %.2f\n", placa, marca, preco);
    }

    public void exibir(double desconto) {

        System.out.printf("Placa: %s\nMarca: %s\nPreço com desconto: %.2f\n", placa, marca, preco * (1 - desconto / 100));
    }
}
