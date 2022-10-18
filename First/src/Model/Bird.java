package Model;

public class Bird implements Animal{
    private int weight;
    private String name;


    public String getName() {
        return name;
    }


    public Bird(int weight, String name){
        this.weight = weight;
        this.name = name;
    }

    public Bird(){
        this.weight = 0;
        this.name = "";
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString(){
        return "Bird \n\t Weight: " + this.getWeight() + "\n\t Name: " + this.getName() + "\n";    }
}
