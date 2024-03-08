public class App {
    public static void main(String[] args) throws Exception {
        new TestCompteBancair();
    }

    static class TestCompteBancair {

        public TestCompteBancair() {
            CompteBancair c1 = new CompteBancair(2004);
            c1.deposer(996);
            c1.retirer(1000);
            c1.AfficherSolde();

        }

    }

    static class CompteBancair {
        double somme;

        public CompteBancair(double somme) {
            if (somme < 0) {
                System.out.println("creation imposible somme negatif");
            } else {
                this.somme = somme;
            }
        }

        public void deposer(double deposer) {
            if (deposer < 0) {
                System.out.println("Depot impossible montant negatif");
            } else {
                this.somme += deposer;
            }
        }

        public void retirer(double retirer) {
            if (retirer > somme) {
                System.out.println("Le montant est insuffisant");
            } else {
                somme -= retirer;
            }
        }

        public void AfficherSolde() {
            System.out.println("Votre solde est de : " + somme);
        }
    }
}
