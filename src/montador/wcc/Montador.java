package montador.wcc;

public class Montador {
    private final int numPlaca;

    public Montador(int numPlaca) {
        this.numPlaca = numPlaca;
    }

    public void geraPlaca(){
        for(int i =0; i<numPlaca; i++){
            System.out.println("\nPlaca: " + (i+1)+"/"+ this.numPlaca);
            Placa placa = new Placa();
            placa.geraComponente();
            placa.listaComponentes();

        }
    }
}
