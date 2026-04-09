public class Rectangle {
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double calculerSurface() {
        return longueur * largeur;
    }

    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    public String toString() {
        return "Rectangle [longueur = " + longueur + ", largeur = " + largeur + "]";
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println(rectangle.toString());
        System.out.println("Surface: " + rectangle.calculerSurface());
        System.out.println("Périmètre: " + rectangle.calculerPerimetre());
    }
}
