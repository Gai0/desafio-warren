public class czxczxc {

    public static void main(String[] args) {

        int n = 10;
        int[] numeros = { 5 };

        int soma = 0;
        for (int i = 0; i < 2; i++) {

            int numeroSelecionado = numeros[i];

            boolean continuar = true;

            int[] numerosParaSoma = new int[10];

            int indiceNumerosParaSoma = 0;

            do {
                soma += numeroSelecionado;

                if (soma > n) {
                    soma -= numeroSelecionado;
                    continuar = false;
                } else {
                    numerosParaSoma[indiceNumerosParaSoma] = numeroSelecionado;
                    indiceNumerosParaSoma++;
                }

                if (soma == n) {
                    continuar = false;
                }
            } while (continuar);

            for (int i2 = 0; i2 < numerosParaSoma.length; i2++) {
                if (numerosParaSoma[i2] != 0) {
                    System.out.print(numerosParaSoma[i2] + "\n");
                }
            }
        }
        System.out.println("Resultado soma: " + soma);
    }
}