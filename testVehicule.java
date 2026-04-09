class Vehicule {
    String marque;
    double vitesseMax;

    public Vehicule(String marque, double vitesseMax) {
        this.marque = marque;
        this.vitesseMax = vitesseMax;
    }

    public String afficher() {
        return "Véhicule [marque = " + marque + ", vitesseMax = " + vitesseMax + "]";
    }
}

class Voiture extends Vehicule {
    int nombrePortes;

    public Voiture(String marque, double vitesseMax, int nombrePortes) {
        super(marque, vitesseMax);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public String afficher() {
        return "Voiture [marque = " + marque + ", vitesseMax = " + vitesseMax + ", nombrePortes = " + nombrePortes + "]";
    }
}

class Moto extends Vehicule {
    String typeMoto;

    public Moto(String marque, double vitesseMax, String typeMoto) {
        super(marque, vitesseMax);
        this.typeMoto = typeMoto;
    }

    @Override
    public String afficher() {
        return "Moto [marque = " + marque + ", vitesseMax = " + vitesseMax + ", typeMoto = " + typeMoto + "]";
    }
}

public class testVehicule {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota", 180.0, 4);
        Moto moto = new Moto("Yamaha", 220.0, "Sport");

        System.out.println(voiture.afficher());
        System.out.println(moto.afficher());
    }
}