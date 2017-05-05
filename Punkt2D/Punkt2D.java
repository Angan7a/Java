public class Punkt2D {
    int x;
    int y;
    public Punkt2D() {
        x = 0;
        y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void wyswietl() {
        System.out.println(x + ", " + y);
    }
}
