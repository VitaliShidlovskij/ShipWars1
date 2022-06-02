import java.util.Arrays;

public class Esminets extends Ship {
    int lengs = 2;

    public Esminets(Board[] array, int lengs) {
        super(array);
        this.lengs = lengs;
    }

    @Override
    public String toString() {
        return "Esminets{" +
                "array=" + Arrays.toString(array) +
                ", lengs=" + lengs +
                '}';
    }
}
