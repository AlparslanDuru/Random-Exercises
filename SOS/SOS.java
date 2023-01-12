import java.util.Scanner;

public class SOS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sos = new StringBuilder();

        // Initialize the game board with dots
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sos.append(".");
            }
            sos.append("\n");
        }

        // Players take turns making moves
        while (true) {
            // Display the current game board
            System.out.println(sos);

            // Get the next move from player 1
            System.out.print("Player 1's move (row column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            sos.set((row * 3) + col, 'S');

            // Check if player 1 has won
            if (checkWin(sos, 'S')) {
                System.out.println("Player 1 wins!");
                break;
            }

            // Display the current game board
            System.out.println(sos);

            // Get the next move from player 2
            System.out.print("Player 2's move (row column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            sos.set((row * 3) + col, 'O');

            // Check if player 2 has won
            if (checkWin(sos, 'O')) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }

    // Returns true if the player has won the game
    public static boolean checkWin(StringBuilder sos, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (sos.charAt(i * 3) == player && sos.charAt(i * 3 + 1) == player && sos.charAt(i * 3 + 2) == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (sos.charAt(i) == player && sos.charAt(i + 3) == player && sos.charAt(i + 6) == player) {
                return true;
            }
        }

        // Check diagonals
        if (sos.charAt(0) == player && sos.charAt(4) == player && sos.charAt(8) == player) {
            return true;
        }
        if (sos.charAt(2) == player && sos.charAt(4) == player && sos.charAt(6) == player) {
            return true;
        }

        return false;
    }
}
