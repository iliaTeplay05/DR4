import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int quantity;
        int yours = 0;
        int mother = 30000;

        System.out.println("Введите количесво арбузов: ");
        quantity = scanner.nextInt();

        int[] melon = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            melon[i] = random.nextInt(30000) + 1;
            System.out.print(melon[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < quantity; i++) {
            if (melon[i] > yours) {
                yours = melon[i];
            }
            if (melon[i] < mother) {
                mother = melon[i];
            }
        }
        System.out.println(mother + " " + yours);
    }
}
