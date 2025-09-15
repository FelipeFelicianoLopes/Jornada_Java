import java.util.Scanner;
public class Vendas {


    private double preco = 100.00,valor;
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


    public void setIdade(int idade) {this.idade = idade;}
    public void setQuantidadeIngressso(int quantidadeIngressso) {this.quantidadeIngressso = quantidadeIngressso;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public void setValor(double Valor) {
        valor = Valor;
    }

    public double desconto() {

        if (tipo == "Inteira") {
            return 12.00;
        } else if (tipo == "Meia" ) {
            return preco / 2;
        }
        else if (tipo == "Promocional" ) {
            return preco * 0.7;
        }
        else{
            return 0.00;
        }

    }
    public void cartao() {
        String a = "verificando ... ...  compra autorizada";
        String[] b = a.split(" ");
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }
    }
    public void dinheiro(Scanner sc) {

        while (true) {
            if (valor < preco) {
                double diferenca = valor - preco;
                System.out.printf("Valor insuficiente, o valor do ingresso é %f, e faltam %f. Deseja ainda comprar o ingreço?(s/n)", valor, diferenca);
                String decisao = sc.nextLine();
                if (decisao.equals("n")) {
                    break;
                }
            }
            else if (valor > preco) {
                System.out.printf("Seu troco do ingresso %f, bom filme.", valor-preco);
                break;
            }
            else {
                System.out.println("Bom filme");
                break;
            }
        }

    }

}