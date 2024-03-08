import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        InputStreamReader mot = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(mot);
        boolean stop = false;
        do {
            String name = br.readLine();
            switch (name) {
                case "rouge":
                    System.out.println("stop feux rouge");
                    stop = true;
                    break;
                case "orange":
                    System.out.print("feux orange arret ou degagment ");
                    stop = true;
                    break;
                case "vert":
                    System.out.println("feu verrt avancer");
                    stop = true;
                    break;
                default:
                    System.out.println("saisi incorect essayer a nouveu");
                    stop = false;
                    break;

            }
        } while (!stop);

    }
}
