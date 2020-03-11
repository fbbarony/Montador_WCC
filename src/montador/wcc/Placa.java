package montador.wcc;

import java.util.Random;

public class Placa {
    private final int numComponentes;
    private Componente tipoComponentes[] = Componente.values();
    private int qntComponentes[] = new int[tipoComponentes.length];

    public Placa() {
        Random random = new Random();
        this.numComponentes = random.nextInt(50);;
    }

    public void geraComponente() {
        System.out.println("Número de componentes dessa placa é: " + this.numComponentes);
        Random random = new Random();
        int indice;
        for (int i = 0; i < this.numComponentes; i++) {
            indice = random.nextInt(tipoComponentes.length-1);
            qntComponentes[indice] = qntComponentes[indice]+1;
        }
    }

    public void listaComponentes() {
        for (int i=0; i<tipoComponentes.length; i++) {
            System.out.println(tipoComponentes[i]+ ":" +qntComponentes[i] );
        }
    }
}
