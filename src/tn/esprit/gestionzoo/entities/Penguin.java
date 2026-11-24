package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin() {
    }

   public Penguin(String name, String family, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(name, family, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public float maxPenguinSwimmingDepth(){
        return this.swimmingDepth;
    }
}
