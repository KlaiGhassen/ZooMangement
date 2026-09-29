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
        z.nbrCages= 21;


        Zoo z1 = new Zoo("belvidair", "tunis", 10);





    }


}
