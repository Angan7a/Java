public class Test {
    public static void main(String[] args) {
        Suma suma = new Suma();
        System.out.println(suma.dodaj(1, 2));
        System.out.println(suma.dodaj(1.0, 2.0));
        System.out.println(suma.dodaj(1.0, 2.0, 3.0));
    }
}
