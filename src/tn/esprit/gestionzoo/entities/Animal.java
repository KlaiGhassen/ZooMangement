package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family, name;
    protected int age;
    protected boolean isMammal;

    //default constructor
    public Animal() {
    }

    // constructor with arguments
    public  Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

   public  Animal(int age, String family, String name, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

   public Animal(boolean isMammal, int age, String family, String name) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

   public Animal(boolean isMammal, int age, String family) {
        this.family = family;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("age is invalid");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
