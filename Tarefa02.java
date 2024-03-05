import java.util.Scanner;

public class Tarefa02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 6;
        char v[] = { 'O', 'R', 'D', 'E', 'N', 'A' };

        for (int i = 0; i < n; i++) {
            System.out.printf("v[%d] = %2c\n", i, v[i]);
        }

    }
}
