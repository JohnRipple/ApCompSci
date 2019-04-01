import java.util.Scanner;
public class Battleship {
    private Player player1;
    private Player player2;
    private int score1 = 0; private int score2 = 0;
    public static void main(String[] args) {
        Battleship b = new Battleship();
        b.setupGame();
        b.playGame();

    }

    public void setupGame(){
        System.out.println("    ____        __  __  __          __    _     \n" +
                "   / __ )____ _/ /_/ /_/ /__  _____/ /_  (_)___ \n" +
                "  / __  / __ `/ __/ __/ / _ \\/ ___/ __ \\/ / __ \\\n" +
                " / /_/ / /_/ / /_/ /_/ /  __(__  ) / / / / /_/ /\n" +
                "/_____/\\__,_/\\__/\\__/_/\\___/____/_/ /_/_/ .___/ \n" +
                "                                       /_/   ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        player1 = new Player(scan.nextLine());
        player1.setupShips();
        System.out.println("Enter Player 2 Name: ");
        player2 = new Player(scan.nextLine());
        player2.setupShips();
    }

    public void playGame(){
        int turn = 0;
        int player1Missles = 0;
        int player2Missles = 0;
        String[] guess = new String[2];
        while(checkForWinner() == false && player1Missles <= 40 && player2Missles <= 40){
            if(turn == 0){
                displayOpponentGameBoardRealTime(turn);
                guess = player1.takeTurn();
                if(player2.checkForHit(guess) == false){
                    System.out.println("Miss\n");
                } else {
                    System.out.println("Hit\n");
                    score1++;
                }
                turn = 1;
                player1Missles++;
            } else {
                displayOpponentGameBoardRealTime(turn);
                guess = player2.takeTurn();
                if(player1.checkForHit(guess) == false){
                    System.out.println("Miss\n");
                } else {
                    System.out.println("Hit\n");
                    score2++;
                }
                turn = 0;
                player2Missles++;
            }
        }
        if (score1 == 9){
            System.out.println("Player 1 Wins");
        } else if (score2 == 9){
            System.out.println("Player 2 Wins");
        }
    }

    private boolean checkForWinner(){
        if (score1 == 9){
            return true;
        } else if (score2 == 9){
            return true;
        }
        return false;
    }

    private void displayOpponentGameBoardRealTime(int f) {
        String[][] o;
        String[][] s;
        if (f == 1) {
            o = player1.getOpponentGameBoard();
            s = player1.getSelfGameBoard();
            System.out.println("Player 2 Turn");
        } else {
            o = player2.getOpponentGameBoard();
            s = player2.getSelfGameBoard();
            System.out.println("Player 1 Turn");
        }
        System.out.print("  ");
        for(int i = 0; i < 10; i++){
            System.out.print(i + "  ");
        }
        System.out.println();
            for(int i = 0; i < 10; i++){
                System.out.print(i + " ");
                for(int j = 0; j < 10; j++){
                    if(o[i][j] == null) {
                        System.out.print("-  ");
                    } else if (o[i][j].equals(Ship.HIT)) {
                        System.out.print("X  ");
                    } else {
                        System.out.print("O  ");
                    }
                }
                System.out.println();
            }

    }

    //Last Brace
}
