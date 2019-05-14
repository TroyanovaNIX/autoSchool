package Module5;

public class Cat{
    private String name;
    public Cat(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "This is a cat. His name is "+getName();
    }

}