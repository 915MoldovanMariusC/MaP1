
//4.La o ferma se cresc pasari,vaci si porci.
//        Sa se afiseze toate animalele care au greutatea
//        mai mare decit 3kg.


import Controller.Controller;
import Repository.MemoryRepo;
import View.View;


public class Main {
    public static void main(String[] args) {
        MemoryRepo repo = new MemoryRepo();
        Controller controller = new Controller(repo);
        View view = new View(controller);
        view.run();
    }
}