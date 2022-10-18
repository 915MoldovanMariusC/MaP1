package View;

import Controller.Controller;
import Model.Animal;

import java.util.Scanner;

public class View {
    Controller controller;

    public View(Controller controller){
        this.controller = controller;
    }

    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input type(pig/cow/bird)");
        String type = scanner.nextLine();
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input weight");
        int weight = scanner.nextInt();
        this.controller.add(type,weight,name);
    }

    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        this.controller.removeByName(name);
    }

    public void filterByWeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Minimum weight: ");
        int weight = scanner.nextInt();
        Animal[] animals = this.controller.filterByWeight(weight);
        for(Animal animal : animals){
            if(animal != null)
                System.out.println(animal);
        }

    }

    public void printMenu(){
        System.out.println("0. Exit");
        System.out.println("1. Add animal");
        System.out.println("2. Remove animal");
        System.out.println("3. See all animals");
        System.out.println("4. Filter by weight");
    }

    public void printAll(){
        Animal[] animals = this.controller.getAll();
        for(Animal animal : animals){
            if(animal != null)
                System.out.println(animal);
        }
    }

    public void run(){
        int option;
        Scanner scanner = new Scanner(System.in);
        while(true){
            this.printMenu();
            option = scanner.nextInt();
            if(option == 0){
                break;
            } else if (option == 1) {
                this.add();
            } else if (option == 2) {
                this.remove();
            } else if(option == 3){
                this.printAll();
            } else if(option == 4){
                this.filterByWeight();
            } else{
                System.out.println("Invalid option");
            }

        }
    }
}
