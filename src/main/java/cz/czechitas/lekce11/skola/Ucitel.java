package cz.czechitas.lekce11.skola;

public class Ucitel extends Osoba {

    private String titul;

    @Override
    public String getDisplayName() {
        return titul + " " + getJmeno() + " " + getPrijmeni();
    }
}
