import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Declaring repeatable annotation type
@Repeatable(Games.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Game {
    String name();
    String day();
}

// Declaring container for repeatable annotation type
@Retention(RetentionPolicy.RUNTIME)
@interface Games {
    Game[] value();
}

// Repeating annotation
@Game(name = "Cricket",  day = "Sunday")
@Game(name = "Hockey",   day = "Friday")
@Game(name = "Football", day = "Saturday")
public class RepeatingAnnotationsExample {
    public static void main(String[] args) {
        // Getting annotation by type into an array
        Game[] games = RepeatingAnnotationsExample.class.getAnnotationsByType(Game.class);
        for (Game game : games) {    // Iterating values
            System.out.println(game.name() + " on " + game.day());
        }
    }
}
