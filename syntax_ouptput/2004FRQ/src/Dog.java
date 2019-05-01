public class Dog extends Pet {
    public Dog(String name){
        super(name);
    }

    public String speak(){
        return "woof";
    }
    @Override
    public String toString(){
        return "I'm a Dog and my name is" + super.getname();
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass().equals(this.getClass())) {
            Dog c = (Dog) o;
            if (c.getname().equals(this.getname()) && c.speak().equals(this.speak())) {
                return true;
            }
        }
        return false;
    }
}
