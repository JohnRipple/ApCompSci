import java.util.*;
public class Player {
    private boolean[][] opponentGameBoard;
    private boolean[][] selfGameBoard;
    private String firstName;
    private Ship[] ships;

    public Player(String f) {
        firstName = f;
        opponentGameBoard = new boolean[10][10];
        selfGameBoard = new boolean[10][10];
    }

    public void setupShips() {
        Scanner sc = new Scanner(System.in);

    }

    public void takeTurn() {

    }

    public boolean checkForHit(String l) {
        return false;
    }
    public boolean[][] getOpponentGameBoard(){
        return opponentGameBoard;
    }
    public boolean won() {
        return false;
    }

}
