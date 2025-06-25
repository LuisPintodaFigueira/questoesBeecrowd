import java.util.Scanner;

public class SequenciaLogica {

    final static Scanner tecladoScanner = new Scanner (System.in);

    public static void main(String[] args) {
        int valor1 = 0;
        int contador = 1;
        int resultado = 0;

        imprimir("digite um número");
        valor1 = lerValorInt(valor1);

        processar(valor1, contador, resultado);

    }

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static int lerValorInt(int valor1) {
        return tecladoScanner.nextInt();
    }

    public static void processar(int valor1, int contador, int resultado) {

        while(valor1 >= 1 && valor1 <= 100) {

            if (contador <= valor1) {
                resultado = contador * 2;
                System.out.print(resultado);
                System.out.println();
                contador++;
            }
        }
    }
}