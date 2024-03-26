package cz.czechitas.lekce11.skola;

import java.util.List;

public class Rodic extends Osoba {
    private List<Student> studenti;

    @Override
    public String getDisplayName() {
        return getJmeno() + " " + getPrijmeni();
    }
}
