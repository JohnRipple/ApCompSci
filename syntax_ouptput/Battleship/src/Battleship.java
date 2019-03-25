import java.util.*;
public class Battleship {
    private Player player1;
    private Player player2;
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
    }

    public void playGame(){

    }

    private void checkForWinner(){

    }

    private void displayOpponentGameBoardRealTime(){

    }


}
