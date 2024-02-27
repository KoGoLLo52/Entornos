package Objects;

public class Midicloriano extends Runner {
    // propiedades definidas en el enunciado
    private int sentido; // igual que en el gorgonita

    // metodo del enunciado
    public Runner Correr(int valor) {
        switch (valor) { //Los casos siguen el orden del enunciado
            case 0 -> {
                return (new Midicloriano());
            }
            case 1 -> {
                return this;
            }
        }
        return null;
    }

    public boolean getSentido(){
        return sentido!=0;
    }

    public int Move(int turn,int diceValue){
        int currentCasilla = this.getCasilla();
        if(turn%3==0){ //turno empieza en 1, haciendo que vaya hacia atras en cada par
            currentCasilla -= diceValue;
            if(currentCasilla < 0){
                currentCasilla = 0;
            }
        }
        currentCasilla += diceValue;
        this.setCasilla(currentCasilla);
        return currentCasilla;
    }
}
