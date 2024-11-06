import java.util.ArrayList;
import java.util.List;

public class CaseIntelligente extends Case {
    
    private List<Case> lesVoisines;

    public CaseIntelligente() {
        lesVoisines = new ArrayList<>();
    }

    public void ajouteVoisine(Case uneCase) {
        lesVoisines.add(uneCase);     
    }


    public int nombreBombes(){
        int cpt = 0;
        for (Case c : lesVoisines) {
            if (c.contientUneBombe()) {
                cpt++;
            }
        }
        return cpt;
    }


    @Override
    public String toString(){
        if (this.estDecouverte()) {
            if (this.estMarquee()) {
                return "?";
            } else {
                return " ";
            }
        } else {
            if (this.contientUneBombe()) {
                return "@";
            } else {
                return "" + this.nombreBombes() + "";
            }
        }
    }

}