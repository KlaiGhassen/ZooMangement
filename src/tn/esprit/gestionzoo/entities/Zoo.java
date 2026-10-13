package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected Animal[] animals;
    protected String name, city;
    protected int nbrAnimals;
    private static final int NBR_CAGES = 25;

  public   Zoo() {
        this.animals = new Animal[25];
    }

  public   Zoo(String name, String city) {
        this.animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

   public Zoo(String name, String city, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("name is empty");
        }
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + NBR_CAGES +
                '}';
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull()) {
            this.animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }


    public void dispalyAnimals() {
        for (int i = 0; i < this.nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public  int searchAnimal(String name) {
        for (int i = 0; i < this.nbrAnimals; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
        int index = this.searchAnimal(animal.name);
        if (index != -1) {
            this.animals[index] = this.animals[nbrAnimals - 1];
            nbrAnimals--;
            return true;
        }
        return false;
    }

    boolean isZooFull() {
        return this.nbrAnimals == NBR_CAGES;

    }

    Zoo compareZoo(Zoo zoo1, Zoo zoo2) {
        if (zoo1.nbrAnimals > zoo2.nbrAnimals) {
            return zoo1;
        } else {
            return zoo2;
        }

    }

}





