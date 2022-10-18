package Repository;

import Model.Animal;

public interface Repository {
    public void add(Animal animal);

    public Animal[] getAll();

    public void removeByName(String name);
}
