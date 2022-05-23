package bootcamp.zadatak1;

public class Alpinista extends Planinar {
    private int poeni;
    public Alpinista(){

    }

    public Alpinista(int id, String ime, String prezime, int poeni) {
        super(id, ime, prezime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    //  Alpinista, id: id
    //  ime: ime i prezime
    //  Broj poena: poeni
    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + getId() +
                "\nime: " + getIme() + " " + getPrezime() +
                "\nBroj poena: " + getPoeni());

    }
    //placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50
    @Override
    public int clanarina() {
        int popust = this.poeni * 50;
        return 1500 - popust;
    }
    //Alpinista može da savlada sve uspone do 4000 metara
    @Override
    public boolean uspesanUspon(Planina planina) {
        if(planina.getVisinaPlanine() < 4000){
            return true;
        }else{
            return false;
        }
    }
}
