package cz.czechitas.lekce11.skola;

public class TridnyUcitel extends Ucitel {
    private Trida trida;

    @Override
    public String getDisplayName() {
        return super.getDisplayName() + " (" + trida + ")";
    }
}
