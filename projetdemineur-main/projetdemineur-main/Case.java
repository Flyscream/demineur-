public class Case {
    private boolean contientUneBombe;
    private boolean estDecouverte;
    private boolean estMarquee;

    public Case() {
        reset();
    }

    public void reset() {
        contientUneBombe = false;
        estDecouverte = false;
        estMarquee = false;
    }
    
    public boolean contientUneBombe() {
        return contientUneBombe;
    }


    public boolean estDecouverte() {
        return estDecouverte;
    }


    public boolean estMarquee() {
        return estMarquee;
    }


    public void reveler() {
        estDecouverte = true;
    }


    public void marquer() {
        estMarquee = true;
    }

}
