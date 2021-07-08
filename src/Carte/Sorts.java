package Carte;

public class Sorts extends Carte{
    private int coupDActivation;
    private int idEffet;
    private boolean vol;
    private boolean celerite;

    public Sorts(Couleur couleur, int coupDActivation, int idEffet, boolean vol, boolean celerite){
        super(couleur);
        this.coupDActivation = coupDActivation;
        this.idEffet = idEffet;
        this.vol = vol;
        this.celerite = celerite;
    }

    @Override
    public String toString() {
        return "Sorts{" +
                "couleur=" + super.couleur +
                ", coupDActivation=" + coupDActivation +
                ", idEffet=" + idEffet +
                ", vol=" + vol +
                ", celerite=" + celerite +
                '}'+
                "engager="+super.isEngager();
    }
}
