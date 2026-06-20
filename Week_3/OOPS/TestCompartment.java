import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class: Premium seating with air conditioning and meal service.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies: Reserved compartment for female passengers only.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General: Standard seating available for all passengers.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage: Storage space for baggage and cargo.";
    }
}

public class TestComp {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
            int random = rand.nextInt(1, 5);
            
            switch (random) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}
