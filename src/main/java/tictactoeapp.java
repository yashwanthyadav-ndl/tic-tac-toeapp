public class tictactoeapp {
    public static void main(String[] args) {
        // 1️⃣ Create a 3x3 character array
        char[][] board = new char[3][3];

        // 2️⃣ Initialization Logic: fill all cells with '-'
        for (int i = 0; i < 3; i++) {          // Outer loop → rows
            for (int j = 0; j < 3; j++) {      // Inner loop → columns
                board[i][j] = '-';
            }
        }

        // 3️⃣ Console Output Formatting: print the board clearly
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) { // Add separator lines between rows
                System.out.println("---+---+---");
            }
        }
    }
}
