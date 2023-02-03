
public class Person {
    private String name;
    private double height;

    public Person(){
        name = "";
        height = 0;
    }
    public void setName(String aName){
        name = aName;
    }
    public String getName(){
        return name;
    }
    public void setHeight(double aheight){
        height = aheight;
    }
    public double getHeight(){
        return height;
    }
    public void setHeightInInches(double aheight){
        height = aheight/2.54;
    }
    public double getHeightInInches()
    {
        return height;
    }
}
