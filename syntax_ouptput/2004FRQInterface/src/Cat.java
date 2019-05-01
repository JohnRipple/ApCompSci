public class Cat implements Pet {
    private String name;
    public Cat(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public String speak(){
        return "Meow";
    }
}
