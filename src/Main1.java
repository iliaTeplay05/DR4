public class Main1 {
    public static void main(String[] args) {
        int meaning = 5;
        for (int number = 5; number < 10; number++) {
            for (int i = 0; i < meaning; i++) {
                System.out.print(number + " ");
            }
            System.out.println();
            meaning--;
        }
    }
}