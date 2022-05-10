import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int[][] cash = new int[13][4];
        int case1 = 0;
        int case2 = 0;
        int case3 = 0;

        Random random = new Random();

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 4; j++) {
                cash[i][j] = random.nextInt(100000 - 20000 + 1) + 20000;
            }
        }
        for (int i = 1; i < 13; i++) {
            System.out.print(i + " ");
            for (int j = 1; j < 4; j++) {
                System.out.print(cash[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 4; j++) {
                case1 += cash[i][j];
            }
        }
        System.out.println("Общая сумма: " + case1);

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 4; j++) {
                case2 += cash[i][j];
            }
            System.out.println("Сумма за квартал, полученная каждым работником " + i + ": " + case2);
            case2 = 0;
        }

        for (int j = 1; j < 4; j++) {
            for (int i = 1; i < 13; i++) {
                case3 += cash[i][j];
            }
            System.out.println("Общая зарплата всех работников за "+ j +" месяц: "+case3);
            case3 = 0;
        }
    }
}
