package checkhuman;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberRandom1 = random.nextInt(101);
        int numberRandom2 = random.nextInt(101);
        CheckHuman h1 = new CheckHuman();

        h1.sumTest(numberRandom1,numberRandom2);
    }
}
