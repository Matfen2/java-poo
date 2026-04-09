class Payment {
    double payer(double montant) {
        return montant;
    }
}

class CarteBancaire extends Payment {
    @Override
    double payer(double montant) {
        System.out.println("Paiement de " + montant + " avec la carte bancaire");
        return montant;
    }
}

class Especes extends Payment {
    @Override
    double payer(double montant) {
        System.out.println("Paiement de " + montant + " en espèces");
        return montant;
    }
}

class Cheque extends Payment {
    @Override
    double payer(double montant) {
        System.out.println("Paiement de " + montant + " par chèque");
        return montant;
    }
}

public class testPayment {
    public static void main(String[] args) {
        Payment payment1 = new CarteBancaire();
        Payment payment2 = new Especes();
        Payment payment3 = new Cheque();

        payment1.payer(100.0);
        payment2.payer(50.0);
        payment3.payer(75.0);
    }
}