import java.util.Random;

public class DayOfWeekSupplier {
    public Season getRandomDayOfWeek() {
        int index = new Random().nextInt(Season.values().length);
        return Season.values()[index];
    }
}
