import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Plateau {
    private int nbLignes;
    private int nbColonnes;
    private int pourcentageDeBombes;
    private List<List<CaseIntelligente>> lePlateau;

    public Plateau(int nbLignes, int nbColonnes, int pourcentageDeBombes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.pourcentageDeBombes = pourcentageDeBombes;
        this.lePlateau = new ArrayList<>();
    }

    public void creerLesCasesVides() {

    }

    public void poseDesBombesAleatoirement() {
        Random generateur = new Random();
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                if (generateur.nextInt(100)+1 < this.pourcentageDeBombes){
                    this.poseBombe(x, y);
                    this.nbBombes = this.nbBombes + 1;
                }
            }
        }
    }
        

    public int getNbLignes() {
        return 0;
    }

    public int getNbColonnes() {
        return 0;
    }

    public int getNbTotalBombes(){
        return 0;
    }

    public CaseIntelligente getCase(int numLigne, int numColonne){

    }

    public int getNbCasesMarquees(){

    }

    public void poseBombe(int X, int Y){

    }

    public void reset(){
        
    }
    
}
