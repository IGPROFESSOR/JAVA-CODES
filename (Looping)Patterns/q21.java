public class q21 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 9;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 && j % 4 == 0) ||
                    (i == 1 && j % 2 == 1) ||
                    (i == 2 && j % 4 == 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


