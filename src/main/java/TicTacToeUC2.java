import java.util.Random;

public class TicTacToeUC2 {

    public static void main(String[] args) {

        Random random = new Random();

        char userSymbol, computerSymbol;
        String currentPlayer;

        // Random toss: 0 or 1
        int toss = random.nextInt(2);

        if (toss == 0) {
            currentPlayer = "User";
            userSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            userSymbol = 'O';
            computerSymbol = 'X';
        }

        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " plays first");
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}