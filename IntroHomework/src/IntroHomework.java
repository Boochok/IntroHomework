
import java.util.Arrays;


/**
 * Intro module homework.
 */

public class IntroHomework {
    public static void main(String[] args) {
        IntroHomework hm = new IntroHomework();

        System.out.println("Task_2:");
        hm.introTask2(0.1);
        System.out.println();

        System.out.println("Task_3:");
        hm.introTask3(1.0, 2.0, 0.2);
        System.out.println();

        System.out.println("Task_4:");
        hm.introTask4(1,8,9,5);
        System.out.println();

        System.out.println("Task_5:");
        hm.introTask5(new char[6][7]);
        System.out.println();
    }


    /**
     * Prints sequence of elements and the number of min element which meets the condition
     * {@code element < epsilon}.
     *
     * @param epsilon
     */
    public void introTask2(double epsilon) {

        for (int i = 1; ; i++) {
            double element = 1 / Math.pow((i + 1), 2);
            if (element < epsilon) {
                System.out.printf("Min element is: %d \n", i);
                break;
            } else
                System.out.println(element);
        }
    }

    /**
     * Prints the table of arguments and values of function.
     *
     * @param a the first argument
     * @param b the last argument
     * @param h the step
     * @throws IllegalArgumentException if last argument is less or equals first argument
     */
    public void introTask3(double a, double b, double h) {

        if (b <= a)
            throw new IllegalArgumentException();
        System.out.println(" args  |function");
        while (a <= b) {
            double valueOfFunction = Math.tan(a * 2) - 3;
            System.out.println("_________________");
            System.out.printf("%.4f | %.4f\n", a, valueOfFunction);
            a = a + h;
        }
    }

    /**
     * Prints max summary of two array's elements according to the specific condition.
     *
     * @param args the array of integers
     */
    public void introTask4(int... args) {

        if (args.length % 2 == 0) {
            int max = args[0] + args[args.length - 1];
            for (int i = 0; i < args.length / 2; i++) {
                if (args[i] + args[args.length - 1 - i] > max) {
                    max = args[i] + args[args.length - 1 - i];
                }
            }
            System.out.printf("Max summary is: %d\n", max);
        } else
            System.out.println("Array should be even");
    }

    /**
     * Prints the matrix.
     *
     * @param args
     */

    public void introTask5(char[][] args) {
        int doubleArrayLength = args.length;
        for (int i = 0; i < doubleArrayLength; i++) {
            int arrayLength = args[i].length;
            for (int j = 0; j < arrayLength; j++) {
                if (i == doubleArrayLength / 2)
                    args[i][j] = chooseTheLetter(i, j, 'M');
                else {
                    if (j == arrayLength / 2)
                        args[i][j] = chooseTheLetter(i, j, 'Л');
                    else {
                        if (i < doubleArrayLength / 2 && j != arrayLength / 2)
                            args[i][j] = i == j || i + j == arrayLength - 1 ? '1' : '0';
                        else
                            args[i][j] = i == j - 1 || i + j == doubleArrayLength - 1 ? '1' : '0';
                    }
                }
            }
            System.out.println(Arrays.toString(args[i]));
        }
    }
    public char chooseTheLetter(int firstIndex, int secondIndex, char ch) {
        return firstIndex == secondIndex ? 'O' : ch;
    }
}
