import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name, city;
    static final int NBR_CAGES = 25;
    int nbrAnimals;


    Zoo() {
        this.animals = new Animal[25];
    }

    Zoo(String name, String city) {
        this.animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

    Zoo(String name, String city, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.animals = animals;
    }

    public String toString() {
        return "Zoo{" +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + NBR_CAGES +
                '}';
    }

    boolean addAnimal(Animal animal) {
        if (this.searchAnimal(animal.name) == -1 && this.nbrAnimals < NBR_CAGES) {
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

    int searchAnimal(String name) {
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





