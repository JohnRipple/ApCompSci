public class Ship {
    private String name;
    private int size;
    private String[] location;
    private boolean isSunk;
    public static String HIT = "X";
    public static String MISS = "O";

    public Ship(String n, int s, String[] l){
        this.name = n;
        this.size = s;
        this.location = l;
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

    public boolean checkForHit(String[] locationToCheck){
        String[] loc = this.getLocation();
        for (int i = 0; i < loc.length; i += 2) {
            if (loc[i].equals(locationToCheck[0]) && loc[i + 1].equals(locationToCheck[1])) {
                return true;
            }
        }
        return false;
    }

}
