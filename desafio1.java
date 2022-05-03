import java.util.Scanner;

public class desafio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um numero!");
    int n = sc.nextInt();
    int reverso = 0;

      while (n > 0) {
      reverso *= 10;
      reverso += (n % 10);
      n /= 10;
    }
    System.out.println("Seu numero reverso é: " + reverso); 

    if (reverso % 2 != 0) {
      while (reverso < 1000) {
        reverso = reverso + 2;
        System.out.println("Numero impar do reverso: " + reverso);
      }
    } else {
      reverso++;
      while (reverso < 1000) {
        System.out.println("Numero impar do reverso: " + reverso);
        reverso = reverso + 2;
      }
    }
    sc.close();
  }
}
