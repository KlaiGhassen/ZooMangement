public class Zoo {
    Animal[] animals;
    String name, city;
    int nbrCages;

    Zoo() {
    }

    Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }


}

