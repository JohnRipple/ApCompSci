public class LoudDoge extends Dog {
    public LoudDoge(String name){
        super(name);
    }

    public String speak(){
        String s = super.speak();
        return s+s;
    }

}
