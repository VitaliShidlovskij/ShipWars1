import java.util.Arrays;

public class Linkor extends Ship {
    int lengs = 4;

    public Linkor(Board[] array, int lengs) {
        super(array);
        this.lengs = lengs;
    }

    @Override
    public String toString() {
        return "Linkor{" +
                "lengs=" + lengs +
                ", array=" + Arrays.toString(array) +
                ", lengs=" + lengs +
                '}';
    }
}
