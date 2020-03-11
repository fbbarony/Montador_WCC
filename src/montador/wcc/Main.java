package montador.wcc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numPlaca;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de placas que deseja:");
        numPlaca = scanner.nextInt();
        Montador montador = new Montador(numPlaca);
        montador.geraPlaca();
    }
}
