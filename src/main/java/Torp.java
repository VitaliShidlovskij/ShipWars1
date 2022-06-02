import java.util.Arrays;

public class Torp extends Ship {
    int lengs = 1;

    public Torp(Board[] array, int lengs) {
        super(array);
        this.lengs = lengs;
    }

    @Override
    public String toString() {
        return "Torp{" +
                "array=" + Arrays.toString(array) +
                ", lengs=" + lengs +
                ", lengs=" + lengs +
                '}';
    }
}
