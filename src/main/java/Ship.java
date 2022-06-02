import java.util.Arrays;

public class Ship {
    Board[] array;
    public Ship(Board[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Количество " + "палуб:" + array.length;
    }
}
