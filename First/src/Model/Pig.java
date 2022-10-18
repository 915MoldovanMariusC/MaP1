package Model;


public class Pig implements Animal{
    private int weight;
    private String name;

    public Pig(){
        this.weight = 0;
        this.name = "Pig";
    }

    public Pig(int weight, String name){
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String toString(){
        return "Pig \n\t Weight: " + this.getWeight() + "\n\t Name: " + this.getName() + "\n";
    }
}
