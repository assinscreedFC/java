import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float moy = 0;
        float min;
        float[] tab = new float[10];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("entrer  un nombre pour la case " + i + " :");
            tab[i] = sc.nextFloat();
            moy += tab[i];
        }

        min = tab[0];
        for (float i : tab) {
            if (i < min) {
                min = i;
            }
        }
        sc.close();

        System.out.println("la moyenne est de : " + (moy / 10));
        System.out.println("le plus petit nombre est :" + min);
    }
}
