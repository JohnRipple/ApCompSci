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
        System.out.println("Use 0-9 for the first location and - then 0-9 again.");
        Scanner sc = new Scanner(System.in);
        String[] bat;
        boolean repeat = false;
        while (repeat == false){
            System.out.println("Battleship Location 4 spots: ");
            bat = sc.nextLine().split("\\s|-");
            repeat = check(bat);
            if(bat.length != 8)
                repeat = false;
            setScoreBoard(bat);
        }
        repeat = false;
        while(repeat == false){
            System.out.println("Cruiser Location 3 spots: ");
            String[] cru = sc.nextLine().split("\\s|-");
            repeat = check(cru);
            if(cru.length != 6)
                repeat = false;
            setScoreBoard(cru);
        }
        repeat = false;
        while (repeat == false){
            System.out.println("Submarine Location 2 spots: ");
            String[] sub = sc.nextLine().split("\\s|-");
            repeat = check(sub);
            if(sub.length != 4)
                repeat = false;
            setScoreBoard(sub);
        }

    }

    public void takeTurn() {

    }

    public boolean checkForHit(String l) {
        return false;
    }
    public boolean[][] getOpponentGameBoard(){
        return opponentGameBoard;
    }

    public boolean[][] getSelfGameBoard(){
        return selfGameBoard;
    }

    public boolean won() {
        return false;
    }

    private boolean check(String[] len){
        if (len.length < 4){
            return false;
        }
        int count = 0;
        int[] x = new int[len.length/2];
        int[] y = new int[x.length];
        for(int i = 0; i < len.length; i+=2){
            x[count] = Integer.parseInt(len[i]);
            y[count] = Integer.parseInt(len[i+1]);
            count++;
        }
        count = 0;
        int next = 0;
        boolean horizontal = false;
        boolean vertical = false;
        for(int i = 0; i < x.length-1; i++){
            if(x[i] == x[i+1] - 1 || x[i] == x[i+1]-1) {
                next++;
            }
        }
        if (next == x.length-1){
            vertical = true;
        }
        if(vertical == false) {
            next = 0;
                for(int i = 0; i < x.length-1; i++) {
                    if (x[i] == x[i + 1]) {
                        next++;
                    }
                }
                if (next == x.length-1)
                    horizontal = true;
        }
        if(horizontal == true){
            for(int i = 0; i < y.length-1; i++){
                if (y[i] == y[i+1] - 1 || y[i] == y[i+1]-1) {
                    count++;
                }
            }
        } else if (vertical == true){
            for(int i = 0; i < y.length-1; i++){
                if (y[i] == y[i+1]) {
                    count++;
                }
            }
        }
        if (count == len.length/2-1){
            return true;
        }
        return false;
    }

    private void setScoreBoard(String[] s){
        for(int i = 0; i < s.length; i+=2){
            selfGameBoard[Integer.parseInt(s[i])][Integer.parseInt(s[i+1])] = true;
        }
    }

}
