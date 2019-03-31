import java.util.ArrayList;

public class Ship {
    private String name;
    private int size;
    private String[] location;
    private boolean isSunk;
    public static String HIT = "X";
    public static String MISS = "O";
    private String[] shipLoc;

    public Ship(String n, int s, String[] l){
        this.name = n;
        this.size = s;
        this.location = l;
        this.shipLoc = l;
        this.isSunk = false;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String[] getLocation() {
        return location;
    }

    public boolean getIsSunk() {
        return isSunk;
    }

    public void setIsSunk(boolean b){
        if(b == true){
            isSunk = true;
            System.out.println("You sunk the " + getName());
        } else
            isSunk = false;
    }

    public boolean checkForHit(String[] locationToCheck){
        String[] loc = this.getLocation();
        for (int i = 0; i < loc.length; i += 2) {
            if (loc[i].equals(locationToCheck[0]) && loc[i + 1].equals(locationToCheck[1])) {
                //if loc all positions are x then set isunk to true
                this.shipLoc[i] = HIT;
                this.shipLoc[i+1] = HIT;
                int hits = 0;
                for(int j = 0; j < this.shipLoc.length; j++){
                    if(this.shipLoc[j].equals(HIT)){
                        hits++;
                    }
                }
                if(hits >= this.shipLoc.length){
                    this.setIsSunk(true);
                }
                return true;
            }
        }
        return false;
    }

}
