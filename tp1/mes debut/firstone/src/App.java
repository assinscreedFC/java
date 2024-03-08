
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) throws Exception {
        // InputStreamReader mot = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(mot);
        // String name = br.readLine();

        Scanner nbr = new Scanner(System.in);
        // System.out.println("Bonjour " + name + ", entrez votre age : ");
        int debut;

        do {
            System.out.println("enter un nombre superieur a 1000");
            debut = nbr.nextInt();
        } while (debut <= 1000 || debut % 2 != 0);

        nbr.close();
        System.out.println("felecitation");
        int D = debut - 1000;
        int som = 0;
        boolean TheFirstBool = true;
        int TheFirst = -1;
        int TheLast = -1;
        for (int i = 2; i < D / 2; i++) {
            if (D % i == 0) {
                System.out.println(D / i);
                som += D / i;
                if (TheFirstBool) {
                    TheFirst = i;
                    TheFirstBool = false;
                }
                TheLast = i;
            }
        }

        System.out.println("le nombre premier est : " + TheFirst);
        System.out.println("le nombre dernier est : " + TheLast);
        System.out.println("la somme des nombres premiers est : " + som);

        // System.out.println("Hello, " + name + "!");
        // System.out.println("enter un nombre superieur a 1000");

    }
}