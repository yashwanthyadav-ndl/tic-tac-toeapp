import java.util.Random;

public class TossForFirstPlayer {
    public static void main(String[] args) {
        // 🎲 Random Number Generator
        Random rand = new Random();

        // 0 → Player 1 starts, 1 → Player 2 starts
        int tossResult = rand.nextInt(2);

        // Game state variables
        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        // ⚖️ Conditional Logic for assigning symbols
        if (tossResult == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        // 📢 Console Output
        System.out.println("Toss Result: " + currentPlayer + " starts first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}
