public class Punkt3D extends Punkt2D {
    int z;

    
    public Punkt3D(Punkt2D p, int z) {
        this.x = p.x;
        this.y = p.y;
        this.z = z;
    }

    public Punkt3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void wyswietl() {
        System.out.println(x + ", " + y + ", " + z);
    }
}
