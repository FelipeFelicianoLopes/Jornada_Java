import java.util.Scanner;

public class Vendas {

    Scanner sc = new Scanner(System.in);
    private double preco = 100.00, valor;
    private int quantidadeIngressso, idade;
    private String tipo;

    public int getIdade() {
        return idade;
    }
    public int getQuantidadeIngressso() {
        return quantidadeIngressso;
    }
    public String getTipo() {
        return tipo;
    }

    public void setIdade(int idade) { this.idade = idade; }
    public void setQuantidadeIngressso(int quantidadeIngressso) { this.quantidadeIngressso = quantidadeIngressso; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getValor() {
        return valor;
    }

    public double desconto() {
        if (tipo.equalsIgnoreCase("Inteira")) {
            return preco = 100.00;
        } else if (tipo.equalsIgnoreCase("Meia")) {
            return preco = preco / 2;
        } else if (tipo.equalsIgnoreCase("Promocional")) {
            return preco = preco * 0.7;
        } else {
            return 0.00;
        }
    }

    public void cartao() {
        String a = "verificando ... ...  compra autorizada";
        String[] b = a.split(" ");
        for (int i = 0; i <= 5; i++) {
            System.out.println(b[i]);
        }
    }

    public void dinheiro() {
        System.out.println("Digite o valor pago pelo cliente: ");
        double pagamento = sc.nextDouble();
        sc.nextLine();

        while (true) {
            if (pagamento < preco) {
                double diferenca = preco - pagamento;
                System.out.printf("Valor insuficiente, o valor do ingresso é %.2f, e faltam %.2f. Deseja ainda comprar o ingresso? (s/n)", preco, diferenca);
                String decisao = sc.nextLine();

                if (decisao.equalsIgnoreCase("n")) {
                    valor = 0;
                    break;

                }
            } else if (pagamento > preco) {
                System.out.printf("Seu troco do ingresso: %.2f, bom filme.", pagamento - preco);
                break;
            } else {
                System.out.println("Bom filme");
                break;
            }
        }
    }
}
