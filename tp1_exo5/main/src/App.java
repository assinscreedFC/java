public class App {
    public static void main(String[] args) throws Exception {

        Etudiant anis = new Etudiant("Anis", 18, 14);
        Etudiant momo = new Etudiant("mom", 24, 17);
        anis.getetudiant();
        momo.getetudiant();
        anis.agumentmoy(0.5);
        anis.getetudiant();
    }

    /**
     * Etudiant
     */
    static class Etudiant {
        String nom;
        int age;
        double moyenne;

        public Etudiant(String n, int a, double m) {
            this.nom = n;
            this.age = a;
            this.moyenne = m;
        }

        public void getetudiant() {
            System.out.println("Nom : " + this.nom);
            System.out.println("Age : " + this.age);
            System.out.println("Moyenne : " + this.moyenne);
        }

        public void agumentmoy(double valeur) {
            this.moyenne += valeur;
        }

    }

}
