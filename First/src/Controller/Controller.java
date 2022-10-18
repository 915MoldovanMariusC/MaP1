package Controller;

import Model.Animal;
import Model.Bird;
import Model.Cow;
import Model.Pig;
import Repository.Repository;

public class Controller {
    private Repository repository;

    public Controller(Repository repository){
        this.repository = repository;
    }

    public void add(String type, int weight, String name){
        Animal animal = null;
        switch (type) {
            case "bird" -> animal = new Bird(weight, name);
            case "pig" -> animal = new Pig(weight, name);
            case "cow" -> animal = new Cow(weight, name);
        }
        if(animal == null){
            throw new RuntimeException("DUMBARSE");
        }
        this.repository.add(animal);
    }

    public void removeByName(String name){
        this.repository.removeByName(name);
    }

    public Animal[] getAll(){
        return this.repository.getAll();
    }

    public Animal[] filterByWeight(int weight){
        Animal[] filtered = new Animal[20];
        int count = 0;
        for(Animal animal : this.repository.getAll()){
            if(animal != null && animal.getWeight() >= weight){
                filtered[count++] = animal;
            }
        }
        return filtered;
    }
}
