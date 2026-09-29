class Animal {
    String family, name;
    int age;
    boolean isMammal;

    //default constructor
    Animal() {
    }
    // constructor with arguments
    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    Animal(int age, String family, String name, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    Animal(boolean isMammal,int age, String family, String name  ) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    Animal(boolean isMammal,int age, String family ) {
        this.family = family;
        this.age = age;
        this.isMammal = isMammal;
    }

}
