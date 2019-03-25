import java.util.*;
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
       // player2 = new Player(scan.nextLine());
        //player2.setupShips();
    }

    public void playGame(){
        int turn = 0;
        //while(checkForWinner() == false){
            if(turn == 0){
                boards(turn);
                turn = 1;
            } else {
                boards(turn);
                turn = 0;
            }
       // }
    }

    private boolean checkForWinner(){
        if (score1 == 9){
            return true;
        } else if (score2 == 9){
            return true;
        }
        return false;
    }

    private void displayOpponentGameBoardRealTime(){

    }

    private void boards(int f) {
        boolean[][] o;
        boolean[][] s;
        if (f == 0) {
            o = player1.getOpponentGameBoard();
            s = player1.getSelfGameBoard();
        } else {
            o = player2.getOpponentGameBoard();
            s = player2.getSelfGameBoard();
        }
            System.out.print("  ");
            for(int i = 0; i < 10; i++){
                System.out.print(i + "  ");
            }
            System.out.println();
            for(int i = 0; i < 10; i++){
                System.out.print(i + " ");
                for(int j = 0; j < 10; j++){
                    if(s[i][j] == false) {
                        System.out.print("-  ");
                    } else {
                        System.out.print("T  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        System.out.print("  ");
        for(int i = 0; i < 10; i++){
            System.out.print(i + "  ");
        }
        System.out.println();
            for(int i = 0; i < 10; i++){
                System.out.print(i + " ");
                for(int j = 0; j < 10; j++){
                    if(o[i][j] == false) {
                        System.out.print("-  ");
                    } else {
                        System.out.print("T  ");
                    }
                }
                System.out.println();
            }

    }


}
