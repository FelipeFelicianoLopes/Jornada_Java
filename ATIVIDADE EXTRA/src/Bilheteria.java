import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bilheteria {
    Scanner sc = new Scanner(System.in);
    private List<Integer>listaQntIngressos = new ArrayList<>();
    private List<String> listaTipo = new ArrayList<>();

    public void status(Vendas vendas) {
        System.out.println("deseja conferir os Status de hoje da bilheiteria?");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("s")) {

            dados(vendas);

            int contInteira = 0, contMeia = 0, contpromossional = 0, gratuito = 0;
            for (String tipo : listaTipo) {
                if (tipo.equalsIgnoreCase("Inteira")) {
                    contInteira++;
                } else if (tipo.equalsIgnoreCase("Meia")) {
                    contInteira++;
                } else if (tipo.equalsIgnoreCase("promossional")) {
                    contpromossional++;
                } else {
                    gratuito++;
                }
            }
            System.out.printf("Inteira: %d\nMeia: %d\nPromossional: %d\nEntrada infantiu: %d", contInteira, contMeia, contpromossional, gratuito);

            int soma = 0;
            for (int i = 0; i < listaQntIngressos.size(); i++) {
                soma += listaQntIngressos.get(i);
            }

            System.out.printf("\nTotal de ingressos: %d\n", soma);
        }else{
            System.out.println("Programa encerrado");
        }

    }

    public void dados(Vendas venda) {
        this.listaQntIngressos.add(venda.getQuantidadeIngressso());
        this.listaTipo.add(venda.getTipo());

    }
    public void executar(Scanner sc) {
        Vendas v = new Vendas();
        System.out.println("digite a quantidade de ingressos: ");
        v.setQuantidadeIngressso(sc.nextInt());
        sc.nextLine();

        int count = 0;
        double valor = 0;

        double valorTotal = 0;
        while (v.getQuantidadeIngressso() != count) {
            System.out.println("Digite a idade: ");
            v.setIdade(sc.nextInt());
            sc.nextLine();
            System.out.println("Digite o tipo do ingresso: ");
            v.setTipo(sc.nextLine());
            valorTotal = v.desconto() + valorTotal;

            count += 1;
        }

        this.status(v);

    }

}
