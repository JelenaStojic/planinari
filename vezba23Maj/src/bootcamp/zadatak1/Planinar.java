package bootcamp.zadatak1;

public abstract class Planinar {
    private int id;
    private String ime;
    private String prezime;

    public Planinar() {
    }

    public Planinar(int id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
    public abstract void stampaj();

    public abstract int clanarina();

    public abstract boolean uspesanUspon(Planina planina);

    @Override
    public String toString() {
        return "Planinar{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}