public class Cat extends Pet {
    public Cat(String name){
        super(name);
    }

    public String speak(){
        return "Meow";
    }

    @Override
    public String toString(){
        return "I'm a cat and my name is" + super.getname();
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass().equals(this.getClass())) {
            Cat c = (Cat) o;
            if (c.getname().equals(this.getname()) && c.speak().equals(this.speak())) {
                return true;
            }
        }
        return false;
    }



}
