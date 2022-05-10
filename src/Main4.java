import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int population;
        int year = 0;
        int string = 0;

        System.out.println("Введите количесво жильцов в доме: ");
        population = scanner.nextInt();

        int[][] man = new int[population][2];

        for (int i = 0; i < population; i++) {
            man[i][0] = random.nextInt(100) + 1;
            System.out.print(man[i][0] + " ");
                man[i][1] = random.nextInt(2);
                System.out.println(man[i][1]);
        }
        for (int i = 0; i < population; i++) {
            if (man[i][1] == 1) {
                if (man[i][0] >= year) {
                    year = man[i][0];
                    string = i+1;
                }
            }
        }
        System.out.println(string);
    }
}
