import java.util.Scanner;

public class Tarefa02 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 6;
        char v[] = { 'O', 'R', 'D', 'E', 'N', 'A' };

        for (int i = 0; i < n; i++) {
            System.out.printf("v[%d] = %c\n", i, v[i]);
        }

        while (true) {
            System.out.print("\nQual a posição de origem? ");
            int i = ler.nextInt();

            if (i >= 0 && i < 6) {
                System.out.print("Qual a posição de destino? ");
                int j = ler.nextInt();

                if (j >= 0 && j < 6) {
                    char aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                    break;
                } else {
                    System.out.println("Digite um valor entre 0 e 5.");
                }
            } else {
                System.out.println("Digite um valor entre 0 e 5.");
            }
        }

        System.out.printf("\nEstado final:\n");

        for (char ch : v) {
            System.out.printf("%c ", ch);
        }
    }
}