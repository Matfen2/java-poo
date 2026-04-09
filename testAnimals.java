interface Animals {};

interface Marcher { void marcher(); }
interface Nager { void nager(); }
interface Voler { void voler(); }

class Chien implements Animals, Marcher, Nager, Voler {
    String name;

    public Chien(String name) {
        this.name = name;
    }

    @Override public void marcher() { System.out.println(name + " marche"); }
    @Override public void nager() { System.out.println(name + " nage"); }
    @Override public void voler() { System.out.println(name + " vole"); }
}

class Aigle implements Animals, Marcher, Voler {
    String name;

    public Aigle(String name) {
        this.name = name;
    }

    @Override public void marcher() { System.out.println(name + " marche"); }
    @Override public void voler() { System.out.println(name + " vole"); }
}

class Canard implements Animals, Marcher, Nager, Voler {
    String name;

    public Canard(String name) {
        this.name = name;
    }

    @Override public void marcher() { System.out.println(name + " marche"); }
    @Override public void nager() { System.out.println(name + " nage"); }
    @Override public void voler() { System.out.println(name + " vole"); }
}

public class testAnimals {
    public static void main(String[] args) {
        Animals[] animals = {
            new Chien("Rex"),
            new Aigle("Eagle"),
            new Canard("Donald")
        };

        for (Animals animal : animals) {
            if (animal instanceof Marcher) {
                ((Marcher) animal).marcher();
            }
            if (animal instanceof Nager) {
                ((Nager) animal).nager();
            }
            if (animal instanceof Voler) {
                ((Voler) animal).voler();
            }
        }
    }
}