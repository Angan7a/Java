public class Test {
    public static void main(String[] args) {
        Punkt2D p2d1 = new Punkt2D();
        Punkt2D p2d2 = new Punkt2D(1, 2);
        Punkt3D p3d = new Punkt3D(p2d2, 34);

        p2d1.wyswietl();
        p2d2.wyswietl();
        p3d.wyswietl();
        
    }
}
