import java.util.Arrays;

public class Kreiser extends Ship {
    int lengs = 3;
    public Kreiser(Board[] array, int lengs) {
        super(array);
        this.lengs = lengs;
    }

    @Override
    public String toString() {
        return "Количество " + "палуб:"  + this.lengs;
    }
}
