package cz.czechitas.lekce11.skola;

public class Student extends Osoba {
    private Trida trida;
    private Rodic rodic;

    public Trida getTrida() {
        return trida;
    }

    public void setTrida(Trida trida) {
        this.trida = trida;
    }

    public Rodic getRodic() {
        return rodic;
    }

    public void setRodic(Rodic rodic) {
        this.rodic = rodic;
    }

    @Override
    public String getDisplayName() {
        return getJmeno() + " " + getPrijmeni() + " (" + trida + ")";
    }
}
