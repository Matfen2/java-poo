class Formes {
    double surface() {
        return 0;
    }    
}

class Cercle extends Formes {
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    double surface() {
        return Math.PI * rayon * rayon;
    }
}

class Rectangle extends Formes {
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    double surface() {
        return longueur * largeur;
    }
}

class Triangle extends Formes {
    double base;
    double hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    double surface() {
        return 0.5 * base * hauteur;
    }
}

public class testFormes {
    public static void main(String[] args) {
        Formes[] formes = {
            new Cercle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4),
        };
        for (Formes forme : formes) {
            System.out.println("Surface: " + forme.surface());
        }
    }
}
