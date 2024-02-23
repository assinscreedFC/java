import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] tab = { 7, 2, 9, 2, 6, 10, 2, 8, 10, 13, 9, 2, 9, 20, 15 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search for in the array: ");
        int nbr = sc.nextInt();
        int occ = 0;
        for (int i : tab) {
            if (nbr == i) {
                occ++;
            }
        }
        System.out.println("nombre occurence de " + nbr + " est de : " + occ);
        sc.close();
    }
}
