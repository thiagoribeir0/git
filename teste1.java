import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 6; // tamanho do vetor
        int v[] = new int[n]; // declaração do vetor "v"
        int i; // índice ou posição

        for (i = 0; i < n; i++) {
            System.out.printf("Informe %2do. valor: ", (i + 1));
            v[i] = ler.nextInt();
        }

        System.out.printf("\n");

        for (i = 0; i < n; i++) {
            System.out.printf("v[%d] = %2d\n", i, v[i]);
        }

        System.out.printf("\n");

        teste1 programa = new teste1();
        int resultado = programa.ordem(v);
        System.out.println("Resultado: " + resultado);
    }

    public int ordem(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                return 1;
            }
        }
        return 0;
    }
}
