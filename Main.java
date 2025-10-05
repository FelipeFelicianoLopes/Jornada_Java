import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean x = true;
        while (x) {
            System.out.print("Digite a opção desejada:\n[1] Moto\n[2] Carro\n[3] Caminhão\nOpção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            System.out.print("Placa: ");
            String placa = sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine(); 

            Veiculo veiculo = null; 

            switch (opcao) {
                case 1:
                    System.out.print("Cilindradas: ");
                    int cilindradas = sc.nextInt();
                    sc.nextLine();
                    veiculo = new Moto(placa, marca, preco, cilindradas);
                    break;

                case 2:
                    System.out.println("Número de portas: ");
                    int portas = sc.nextInt();
                    sc.nextLine(); 
                    veiculo = new Carro(placa, marca, preco, portas);
                    break;

                case 3:
                    System.out.println("Capacidade de carga: ");
                    double carga = sc.nextDouble();
                    sc.nextLine();
                    veiculo = new Caminhao(placa, marca, preco, carga);
                    break;
            }

            System.out.println("Deseja continuar cadastrando? (s/n): ");
            String e = sc.nextLine();

            if (e.equalsIgnoreCase("n")) {
                x = false;
                veiculo.exibir();
            }
            else if(e.equalsIgnoreCase("n")){
                x = true;
            }
                else{
                System.out.println("Inválido");
                }
            }
        

        sc.close();
    }
}
