package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public Aquatic() {
    }

    public Aquatic(String name, String family, int age, boolean isMammal, String habitat) {
        super(name, family, age, isMammal);
        this.habitat = habitat;

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Aquatic aquatic = (Aquatic) obj;

        return this.habitat.equals(aquatic.habitat) && this.name.equals(aquatic.name) && this.age == aquatic.age;


    }


}
