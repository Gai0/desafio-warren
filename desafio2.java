import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos presentes!");
        int alunos = sc.nextInt();

        System.out.println("Informe o tempo de chegada de cada aluno");
        int tempoChegada1 = sc.nextInt();
        int tempoChegada2 = sc.nextInt();
        int tempoChegada3 = sc.nextInt();
        int tempoChegada4 = sc.nextInt();
        int tempoChegada5 = sc.nextInt();

        if (alunos >= 3 && tempoChegada1 <= 0 || tempoChegada2 <= 0 || tempoChegada3 <= 0 || tempoChegada4 <= 0
                || tempoChegada5 <= 0) {
            System.out.println("Aula Normal");
        } else {
            System.out.println("Aula Cancelada");
        }
        sc.close();
    }
}
