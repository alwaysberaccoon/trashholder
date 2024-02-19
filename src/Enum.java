import java.sql.SQLOutput;

public class Enum {
    public static void main(String [] args) {
        Animal animal = Animal.CAT;
        switch (animal) {
            case CAT:
                System.out.println("Its a cat");
                break;
            case DOG:
                System.out.println("Its a dog");
                break;
        }
        Seasons seasons = Seasons.SUMMER;
        switch (seasons) {
            case SUMMER:
                System.out.println("Жара");
                break;
        }

    }
}
