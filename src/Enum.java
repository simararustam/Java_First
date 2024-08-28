import java.util.EnumSet;

public class Enum {
    public enum Month {
        January, February, March, April, May, June, July, August;


        public boolean isSummer() {
//      The EnumSet.of(June, July, August) creates a set of the summer months.
//      contain(this) if current is one of set elements return true
            return EnumSet.of(June, July, August).contains(this);
        }
    }

    public static void main(String[] args) {
        Month current = Month.August;

        if (current.isSummer()) {
            System.out.println("It is a summer month");
        }
    }
}
