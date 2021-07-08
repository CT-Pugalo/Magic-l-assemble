package Carte;

public class Carte {
    protected Couleur couleur;
    private boolean engager = false;

    public Carte(Couleur couleur){
        this.couleur = couleur;
    }

    public boolean isEngager(){
        return engager;
    }

    public void engagerCarte(){
        if(!this.engager){
            engager = true;
        }
    }
    public void deEngagerCarte(){
        if(this.engager) {
            engager = false;
        }
    }
}