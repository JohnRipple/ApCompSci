public class LoudDoge extends Dog {
    public LoudDoge(String name){
        super(name);
    }

    public String speak(){
        String s = super.speak();
        return s+s;
    }
    @Override
    public String toString(){
        return "I'm a Loud Dog and my name is" + super.getname();
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass().equals(this.getClass())) {
            LoudDoge c = (LoudDoge) o;
            if (c.getname().equals(this.getname()) && c.speak().equals(this.speak())) {
                return true;
            }
        }
        return false;
    }
}
