import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("------------------");
        a.family = "king of the jungle";
        a.name = "simba";
        a.age = 10;
        a.isMammal = true;
        System.out.println(a);

        Zoo z = new Zoo();
        z.name = "esprit";
        z.city = "ariana";
        z.nbrCages = 21;


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
