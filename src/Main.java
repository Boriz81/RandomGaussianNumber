import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double k = scanner.nextInt();
        double n = scanner.nextInt();
        double m = scanner.nextDouble();

        while (true) {
            Random random = new Random((int) k);
            for (int i = 1; i <= n; i++) {
                double gaussianNumber = random.nextGaussian();
                if (gaussianNumber <= m) {
                    if (i == n) {
                        System.out.println((int) k);
                        return;
                    }
                } else {
                    k++;
                    break;
                }
            }
        }









    }


     /*   public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int lower = scanner.nextInt();
            int upper = scanner.nextInt();
            Random random = new Random();

            int intervalLength = upper - lower + 1;

            System.out.println(random.nextInt(intervalLength) + lower);
            System.out.println(random.nextInt(intervalLength) + lower);
            System.out.println(random.nextInt(intervalLength) + lower);
            System.out.println(random.nextInt(intervalLength) + lower);
        }*/
    }
