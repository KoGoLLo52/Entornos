package Objects;

public class Runner {
    //propiedades definidas en el enunciado
    private static int sigDorsal = 1;
    private int casilla;
     
    //Propiedades nuestras
    private int dorsal;

    public Runner(){
        casilla = 0;
        dorsal = sigDorsal;
        sigDorsal++;
    }

    protected int getCasilla(){
        return casilla;
    }

    protected void setCasilla(int casilla){
        this.casilla = casilla;
    }
}
