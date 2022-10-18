package Repository;

import Model.Animal;

import java.util.Objects;

public class MemoryRepo implements Repository{
    Animal[] animals;
    int length = 0;

    public MemoryRepo(){
        length = 0;
        animals = new Animal[10];
    }

    @Override
    public void add(Animal animal) {
        this.animals[length++] =  animal;
    }

    @Override
    public Animal[] getAll() {
        return animals;
    }


    @Override
    public void removeByName(String name) {
        for(int i = 0; i < this.length; i++){
            if(Objects.equals(this.animals[i].getName(), name)){
                for(int j = i; j < this.length; j++){
                    this.animals[j] = this.animals[j+1];
                }
                this.length--;
                return;
            }
        }
    }
}
