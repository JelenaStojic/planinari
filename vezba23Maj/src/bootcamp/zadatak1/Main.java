package bootcamp.zadatak1;

import java.util.ArrayList;

//instancirati jednu planinu
//napraviti niz ili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste
//ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na instanciranu planin
//ispisati kolika je zbir svih clanarina planinara iz niza/liste
public class Main {
    public static void main(String[] args) {
        Planina planina = new Planina("Tara", "Srbija", 1544.0);

        ArrayList<Planinar>listaPlaninara = new ArrayList<>();

        listaPlaninara.add(new RekreativniPlaninar(34, "Marko", "Markovic", 15, "Neki okrug", 1800));
        listaPlaninara.add(new RekreativniPlaninar(54, "Sima", "Maric", 7, "Neki okrug", 2200));
        listaPlaninara.add(new RekreativniPlaninar(87, "Janko", "Jankovic", 6, "Neki okrug", 2100));
        listaPlaninara.add(new Alpinista(55, "Mira", "Mirkovic", 34));
        listaPlaninara.add(new Alpinista(99, "Marjana", "Jankovic", 16));
        listaPlaninara.add(new Alpinista(23, "Irena", "Ivkov", 12));

        for(Planinar p : listaPlaninara){
            System.out.println(p);
        }

        for(Planinar p : listaPlaninara){
            System.out.println("Planinar " + p.getIme() + " " + p.getPrezime() + " se uspesno popeo na " +
                    planina.getImePlanine() + " = " + p.uspesanUspon(planina));
        }


        double sum = 0;
        for(Planinar p : listaPlaninara){
            sum = sum + p.clanarina();
        }
        System.out.println("Zbir clanarina svih clanova je: " + sum);
    }

}
