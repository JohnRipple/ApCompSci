public class Dog implements Pet {
    private String name;
    public Dog(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public String speak(){
        return "Woof";
    }
}
