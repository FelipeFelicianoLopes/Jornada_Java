import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bilheteria {
    Scanner sc = new Scanner(System.in);
    private List<Integer> listaQntIngressos = new ArrayList<>();
    private List<String> listaTipo = new ArrayList<>();

    public void status(Vendas vendas) {
        System.out.println("Deseja conferir os Status de hoje da bilheteira?");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            dados(vendas);

            int contInteira = 0, contMeia = 0, contPromocional = 0, gratuito = 0;
            for (String tipo : listaTipo) {
                if (tipo.equalsIgnoreCase("Inteira")) {
                    contInteira++;
                } else if (tipo.equalsIgnoreCase("Meia")) {
                    contMeia++;
                } else if (tipo.equalsIgnoreCase("Promocional")) {
                    contPromocional++;
                } else {
                    gratuito++;
                }
            }
            System.out.printf("Inteira: %d\nMeia: %d\nPromocional: %d\nEntrada infantil: %d", contInteira, contMeia, contPromocional, gratuito);

            int soma = 0;
            for (int i = 0; i < listaQntIngressos.size(); i++) {
                soma += listaQntIngressos.get(i);
            }

            System.out.printf("\nTotal de ingressos: %d\n", soma);
        } else {
            System.out.println("Programa encerrado");
        }
    }

    public void dados(Vendas venda) {
        if (venda.getQuantidadeIngressso() > 0) {
            this.listaTipo.add(venda.getTipo());
            this.listaQntIngressos.add(venda.getQuantidadeIngressso());
        } else {
            System.out.println("Tchau");
        }
    }

    public void executar(Scanner sc) {
        Vendas v = new Vendas();
        System.out.println("Digite a quantidade de ingressos: ");
        v.setQuantidadeIngressso(sc.nextInt());
        sc.nextLine();
        int count = 0;
        double valorTotal = 0;

        while (v.getQuantidadeIngressso() != count) {
            System.out.println("Digite a idade: ");
            v.setIdade(sc.nextInt());
            sc.nextLine();
            System.out.println("Digite o tipo do ingresso, só 100 reais :(inteira, meia, gratis, promocional) ");
            v.setTipo(sc.nextLine());
            valorTotal = v.desconto() + valorTotal;
            System.out.println("Digite a forma de pagamento: (cartao/dinheiro)");
            String formaPagamento = sc.nextLine();

            if (formaPagamento.equalsIgnoreCase("cartao")) {
                v.cartao();
            } else if (formaPagamento.equalsIgnoreCase("dinheiro")) {
                v.dinheiro();
            } else {
                System.out.println("Opção inválida");
            }

            count += 1;
        }

        this.status(v);
    }
}
