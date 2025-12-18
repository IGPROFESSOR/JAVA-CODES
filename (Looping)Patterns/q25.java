public class q25 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = (char) ('E' - i);

            // Print decreasing alphabets
            for (char c = 'E'; c >= ch; c--) {
                System.out.print(c + " ");
            }

            // Print increasing alphabets
            for (char c = (char) (ch + 1); c <= 'E'; c++) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}

