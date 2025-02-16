class Q92PatternHomeWork_1 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int startOdd = 1; // Starting value for odd columns
        int startEven = 9; // Starting value for even columns

        for (int i = 1; i <= rows; i++) {
            int currentOdd = startOdd; // Current value for odd columns
            int currentEven = startEven; // Current value for even columns

            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) { // Odd columns
                    System.out.print(currentOdd + " ");
                    currentOdd++;
                } else { // Even columns
                    System.out.print(currentEven + " ");
                    currentEven--;
                }
            }

            // Adjust starting values for the next row
            startOdd++;
            startEven -= 2;

            System.out.println(); // Move to the next line
        }
    }
}