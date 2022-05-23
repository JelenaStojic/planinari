package bootcamp.zadatak1;

// Rekreativac, id: id
// ime: ime prezime Okrug: okrug
public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String nazivOkruga;
    private double maksimalanUsponBezOpreme;

    public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String nazivOkruga, double maksimalanUsponBezOpreme) {
        super(id, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalanUsponBezOpreme = maksimalanUsponBezOpreme;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public double getMaksimalanUsponBezOpreme() {
        return maksimalanUsponBezOpreme;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + getId() +
                "\nime: " + getIme() + " " + getPrezime() + "Okrug " + getNazivOkruga());
    }

    @Override
    public int clanarina() {
        return 1000;
    }

    //da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine
    // planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
    @Override
    public boolean uspesanUspon(Planina planina){
        if(maksimalanUsponBezOpreme - getTezinaOpreme()*50 < planina.getVisinaPlanine()){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "RekreativniPlaninar{" +
                "tezinaOpreme=" + tezinaOpreme +
                ", nazivOkruga='" + nazivOkruga + '\'' +
                ", maksimalanUsponBezOpreme=" + maksimalanUsponBezOpreme + super.toString();
    }
}
