public class Ship {
    private String name;
    private int size;
    private String[] location;
    private boolean isSunk;

    public Ship(String n, int s, String[] l){
        name = n;
        size = s;
        location = l;
        isSunk = false;
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

    public boolean hit(String locationToCheck){
        return false;
    }

}
