package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("------------------");
        a.setFamily("king of the jungle");
        a.setName("simba");
        a.setAge(10);
        a.setMammal(true);
        System.out.println(a);

        Zoo z = new Zoo();
        z.setName("esprit");
        z.setCity("ariana");


        System.out.println("instruction 8 : ");
        System.out.println(z);
        z.addAnimal(a);
        z.addAnimal(new Animal("the prince of the jg", "bagira", 12, true));
        System.out.println("instruction 11 : ");
        z.addAnimal(a);
        z.dispalyAnimals();
        System.out.println("index equals : " + z.searchAnimal("simba"));


    }


}
