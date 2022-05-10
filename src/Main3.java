public class Main3 {
    public static void main(String[] args) {
        int a;

        int[] number = new int[5];

        for (int i = 0; i < 5; i++) {
            number[i] = i+1;
        }

        for (int i = 0; i < 5; i++) {
        System.out.print(number[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                a = number[i];
                number[i] = number[i + 1];
                number[i + 1] = a;
                System.out.print(number[i] + " ");
            }
            System.out.println(number[4]);
        }
    }
}
