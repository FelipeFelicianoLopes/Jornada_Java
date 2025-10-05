import java.util.Scanner; import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> lista = new ArrayList<>();//aqui to criando uma lista pra resceber todos os valores e listae posteriormente quando for exibir os status

        boolean x = true;
        while (x) {
            System.out.print("Digite a opção desejada:\n[1] Moto\n[2] Carro\n[3] Caminhão\nOpção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            System.out.print("Placa: ");
            String placa = sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            switch (opcao) {//achei melhor pra colocar o case inves do if e else
                case 1:
                    System.out.print("Cilindradas: ");
                    int cilindradas = sc.nextInt();
                    sc.nextLine();
                    Veiculo moto = new Moto(placa, marca, preco, cilindradas);
                    lista.add(moto);//adiciona a lista 
                    break;

                case 2:
                    System.out.print("Número de portas: ");
                    int portas = sc.nextInt();
                    sc.nextLine();
                    Veiculo carro = new Carro(placa, marca, preco, portas);
                    lista.add(carro);
                    break;

                case 3:
                    System.out.print("Capacidade de carga (toneladas): ");
                    double carga = sc.nextDouble();
                    sc.nextLine();
                    Veiculo caminhao = new Caminhao(placa, marca, preco, carga);
                    lista.add(caminhao);
                    break;
            }

            System.out.print("Deseja continuar ? (s/n): ");
            String e = sc.nextLine();

            if (e.equalsIgnoreCase("s")) {//equals ignore case  faz com que n importa se é maíusculo ou minúsculo 
                x = true;
            }
            else if (e.equalsIgnoreCase("n")) {
                x = false;
                break;
            }
            else{
                System.out.println("Inválido");
            }
        }

        for (Veiculo v : lista) {//percorre todos os veiculos cadastrados
            v.exibir();
        }
        sc.close();

    }
}

