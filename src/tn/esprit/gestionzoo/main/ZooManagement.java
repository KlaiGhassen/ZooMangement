package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {
    public static void main(String[] args) {

        try {
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
            z.addAnimal(a);

            z.dispalyAnimals();
            System.out.println("index equals : " + z.searchAnimal("simba"));


            Aquatic aquatic = new Aquatic("test aquatic", "water animals", 30, false, "habitat");
            Aquatic aquatic2 = new Aquatic("test aquatic", "water animals", 30, false, "habitat");

            Dolphin dolphin = new Dolphin();
            Penguin penguin = new Penguin();
            aquatic.swim(); // a quatic swiming
            dolphin.swim(); // This dolphin is swimming
            penguin.swim();
            z.addAquaticAnimal(aquatic);
            z.addAquaticAnimal(dolphin);
            z.addAquaticAnimal(penguin);
            System.out.println("--------------------------------");
            for (Aquatic aquatic1 : z.aquaticAnimals) {
                aquatic1.swim();
            }
            System.out.println("--------------------------------");
            z.displayNumberOfAquaticsByType();
            System.out.println("--------------------------------");

            System.out.println(aquatic.equals(aquatic2));
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


    }

}
