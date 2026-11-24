package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public Aquatic() {
    }

    public  Aquatic(String name, String family, int age, boolean isMammal, String habitat) {
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

    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }


}
