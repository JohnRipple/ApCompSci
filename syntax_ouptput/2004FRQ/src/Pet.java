public abstract class Pet {
    private String myName;
    public Pet(String name){
        myName = name;
    }

    public String getname(){
        return myName;
    }

    public abstract String speak();
}
