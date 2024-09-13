public class Reduce {
    public static void main(int n) {
        int steps = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                steps++;
                n = n / 2;
            }
            else {
                steps++;
                n--;
            }
        }

        System.out.println(steps);
    }
}
