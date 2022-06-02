public class Main {
    public static void main(String[] args){
        Board[] a = new Board [1];
        Board i = new Board(2,2);
        a [0] = i;
        Ship port = new Ship (a);
        Kreiser three = new Kreiser (a,3);
        Esminets two = new Esminets (a, 2);
        Torp one = new Torp  (a,1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
