// Grandparent class
class Creature {
    String species;

    public Creature(String species) {
        this.species = species;
    }

    public void breathe() {
        System.out.println(species + " is breathing.");
    }
}

// Parent class
class Primate extends Creature {
    public Primate(String species) {
        super(species);
    }

    public void climb() {
        System.out.println(species + " is climbing.");
    }
}

// Child class
class Gorilla extends Primate {
    public Gorilla(String species) {
        super(species);
    }

    public void roar() {
        System.out.println(species + " is roaring.");
    }
}

// Main class
class activity {
    public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla("Silverback");
        myGorilla.breathe();
        myGorilla.climb();
        myGorilla.roar();
    }
}
