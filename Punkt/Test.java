public class Test {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();
        punkt.x = 0;
        punkt.y = 0;


        punkt.zwiekszXoJeden();
        punkt.zwiekszYoJeden();
        System.out.println(punkt.podajX());
        System.out.println(punkt.podajY());
        
        punkt.zwiekszXo(12);
        punkt.zwiekszYo(13);

        punkt.wyswietl();
     
    }

}
