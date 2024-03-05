import java.util.Scanner;

public class Tarefa02 {

    Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Tarefa02 programa = new Tarefa02();
        programa.executar();
    }

    public void executar() {
        int n = 6;
        char v[] = { 'O', 'R', 'D', 'E', 'N', 'A' };

        for (int i = 0; i < n; i++) {
            System.out.printf("v[%d] = %2c\n", i, v[i]);
        }

        alterarValor();
    }

    public void alterarValor() {
        int cont = 0;
        do {
            System.out.print("Qual a posição de origem? ");
            int i = ler.nextInt();
            if (i >= 0 & i < 6) {
                System.out.print("Qual a posição de destino? ");
                int j = ler.nextInt();
            } else {
                System.out.println("Digite um valor entre 0 e 5.");
            }
        } while (cont > 0 || cont < 6);
    }
}
