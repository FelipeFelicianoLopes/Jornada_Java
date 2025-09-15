import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bilheteria b = new Bilheteria();
        boolean flag = true;
        while (flag) {
            b.executar(sc);
            System.out.println("deseja adicionar mais clientes? (s/n)");
            String op = sc.nextLine();
            if (op.equals("s")) {
                flag = true;
            }
            else if (op.equals("n")) {
                flag = false;
            }
            else{
                System.out.println("Opcao invalida!");
            }
        }




        sc.close();
    }
}

