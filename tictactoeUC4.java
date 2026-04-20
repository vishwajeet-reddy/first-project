public class TicTacToeUC4 {

    public static void main(String[] args) {

        int slot = 5;

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }
}
