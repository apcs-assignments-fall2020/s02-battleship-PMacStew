import javax.lang.model.util.ElementScanner6;

public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        return (board[row][col] == true) ? true : false;
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        for (int i = 0; i < boatLength; i++) {
            if (direction.equals("down"))
                board[row + i][col] = true;
            else 
                board[row][col + i] = true;
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        String temp = "";
        for (String[] row : words) {
            temp = row[0];
            for (String word : row) {
                if (!alphabeticalOrder(temp, word))
                    return false;
            }
        }
        return true;
    }

    public static boolean alphabeticalOrder(String word1, String word2) {
        if (word1.length() > word2.length())
            return false;
        for (int i = 0; i < word2.length(); i++) {
            if (word1.charAt(i) > word2.charAt(i))
                return false;
            else if (word1.charAt(i) == word2.charAt(i))
                continue;
            else 
                return true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(alphabeticalOrder("anchor", "boating"));

    }
}
