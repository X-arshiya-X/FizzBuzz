public class Multiples {
    public static int main(int n, int mult1, int mult2) {

        int count = 0;

        for (int i = 1; i < n; i++) {
            if (i % mult1 == 0 || i % mult2 == 0) {
                count++;
            }
        }

        System.out.println(count);
        return count;
    }
}
