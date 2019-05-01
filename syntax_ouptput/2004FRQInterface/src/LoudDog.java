public class LoudDog implements Pet {
    private String name;
    public LoudDog(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public String speak(){
        return new Dog("").speak() + new Dog("").speak();
    }
}
