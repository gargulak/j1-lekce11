package cz.czechitas.lekce11.skola;

public class SkolniSystem {

    public static void main(String[] args) {
        Rodic rodic = new Rodic();
        rodic.setJmeno("Rodic");
        rodic.setPrijmeni("Janka");

        Student student = new Student();
        student.setJmeno("Jan");
        student.setPrijmeni("Novak");
        student.setAdresa(new Adresa());
        student.setRodic(rodic);
        student.setTrida(new Trida("6.A"));

        System.out.println(student.getDisplayName());
    }
}
