public class Main {
    public static void main(String[] args) {
        for (int number = 1; number < 6; number++) {
            for (int meaning = 0; meaning < number; meaning++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}