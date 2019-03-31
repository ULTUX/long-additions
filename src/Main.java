
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            while (true)
            {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                Program.dodawanie(a, b);
            }

        }

    }
}
