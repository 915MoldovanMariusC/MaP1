package Model;

public class Cow implements Animal {
    private int weight;
    private String name;

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Cow() {
        this.weight = 0;
        this.name = "Cow";
    }

    public Cow(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public String toString(){
        return "Cow \n\t Weight: " + this.getWeight() + "\n\t Name: " + this.getName() + "\n";
    }

}
