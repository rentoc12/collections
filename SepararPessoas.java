import java.util.ArrayList;
import java.util.Scanner;

public class SepararPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = sc.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = sc.nextLine().trim().toUpperCase();

            if (sexo.equals("M")) {
                masculino.add(nome);
            } else if (sexo.equals("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido, use apenas M ou F.");
            }
        }

        System.out.println("\n=== Grupos ===");
        System.out.println("Masculino: " + masculino);
        System.out.println("Feminino: " + feminino);

        sc.close();
    }
}
