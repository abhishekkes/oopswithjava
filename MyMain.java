public class MyMain {

    public static void main(String[] args) {
        String day = "Wednesday";
        String category = getDayCategory(day);
        System.out.println(day + " is a " + category + ".");
    }

    public static String getDayCategory(String day) {
        return switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Unknown";
        };
    }
}
