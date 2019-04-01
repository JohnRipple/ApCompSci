import java.util.Scanner;
public class Player {
    private String[][] opponentGameBoard;
    private String[][] selfGameBoard;
    private String firstName;
    private Ship[] ships = new Ship[3];

    public Player(String f) {
        this.firstName = f;
        this.opponentGameBoard = new String[10][10];
        this.selfGameBoard = new String[10][10];
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
            if(repeat == true){
                setScoreBoard(bat);
                ships[0] = new Ship("Battleship", 4, bat);
            }
        }
        repeat = false;
        while(repeat == false){
            System.out.println("Cruiser Location 3 spots: ");
            String[] cru = sc.nextLine().split("\\s|-");
            repeat = check(cru);
            if(cru.length != 6)
                repeat = false;
            if(repeat == true) {
                setScoreBoard(cru);
                ships[1] = new Ship("Cruiser", 3, cru);
            }
        }
        repeat = false;
        while (repeat == false){
            System.out.println("Submarine Location 2 spots: ");
            String[] sub = sc.nextLine().split("\\s|-");
            repeat = check(sub);
            if(sub.length != 4)
                repeat = false;
            if(repeat == true) {
                setScoreBoard(sub);
                ships[2] = new Ship("Submarine", 2, sub);
            }
        }

    }

    public String[] takeTurn() {
        Scanner s = new Scanner(System.in);
        String[] guess = new String[2];
        System.out.println("Input Guess Location: ");
        guess = s.nextLine().split("-");
        return guess;
    }

    public boolean checkForHit(String[] l) {
        for(int j = 0; j < 3; j++) {
            String[] loc = ships[j].getLocation();
            if(ships[j].checkForHit(l) == true){
                this.opponentGameBoard[Integer.parseInt(l[0])][Integer.parseInt(l[1])] = Ship.HIT;
                return true;
            }
        }
        this.opponentGameBoard[Integer.parseInt(l[0])][Integer.parseInt(l[1])] = Ship.MISS;
        return false;
    }
    public String[][] getOpponentGameBoard(){
        return opponentGameBoard;
    }

    public String[][] getSelfGameBoard(){
        return selfGameBoard;
    }

    public boolean won() {
        //completed in checkForWinner function in Battleship class
        return false;
    }

    private boolean check(String[] len){
        try {
            if (len.length < 4) {
                return false;
            }
            int count = 0;
            int[] x = new int[len.length / 2];
            int[] y = new int[x.length];
            for (int i = 0; i < len.length; i += 2) {
                x[count] = Integer.parseInt(len[i]);
                y[count] = Integer.parseInt(len[i + 1]);
                count++;
            }
            count = 0;
            int next = 0;
            boolean horizontal = false;
            boolean vertical = false;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] == x[i + 1] - 1 || x[i] == x[i + 1] + 1) {
                    next++;
                }
            }
            if (next == x.length - 1) {
                vertical = true;
            }
            if (vertical == false) {
                next = 0;
                for (int i = 0; i < x.length - 1; i++) {
                    if (x[i] == x[i + 1]) {
                        next++;
                    }
                }
                if (next == x.length - 1)
                    horizontal = true;
            }
            if (horizontal == true) {
                for (int i = 0; i < y.length - 1; i++) {
                    if (y[i] == y[i + 1] - 1 || y[i] == y[i + 1] + 1) {
                        count++;
                    }
                }
            } else if (vertical == true) {
                for (int i = 0; i < y.length - 1; i++) {
                    if (y[i] == y[i + 1]) {
                        count++;
                    }
                }
            }
            if (count == len.length / 2 - 1) {
                return true;
            }
            return false;
        }catch(NumberFormatException e){
            return false;
        }
    }

    private void setScoreBoard(String[] s){
        for(int i = 0; i < s.length; i+=2){
            selfGameBoard[Integer.parseInt(s[i])][Integer.parseInt(s[i+1])] = "S";
        }
    }

}
