package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    protected Animal[] animals;
    protected String name, city;
    protected int nbrAnimals;
    private static final int NBR_CAGES = 3;
    public Aquatic[] aquaticAnimals;
    protected int nbrAquatic = 0;

    public Zoo() {
        this.aquaticAnimals = new Aquatic[3];
        this.animals = new Animal[25];

    }

    public Zoo(String name, String city) {
        this.aquaticAnimals = new Aquatic[3];
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

    public void addAnimal(Animal animal) throws ZooFullException {
        if (nbrAnimals >= NBR_CAGES) {
            throw new ZooFullException("maram got +1");
        }
        this.animals[nbrAnimals] = animal;
        nbrAnimals++;


    }


    public void dispalyAnimals() {
        for (int i = 0; i < this.nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(String name) {
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

    public void addAquaticAnimal(Aquatic aquatic) {
        this.aquaticAnimals[nbrAquatic] = aquatic;
        nbrAquatic++;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrDolphin = 0;
        int nbrPenguin = 0;

        for (Aquatic aquatic : this.aquaticAnimals) {
            if (aquatic.getClass() == Dolphin.class) {
                Dolphin d = (Dolphin) aquatic;
                nbrDolphin++;
                System.out.println("Dolphins : " + nbrDolphin);
            } else if (aquatic instanceof Penguin p) {
                System.out.println(p.getSwimmingDepth());
                nbrPenguin++;
                System.out.println("Penguin: " + nbrPenguin);
            }
        }


    }

}





