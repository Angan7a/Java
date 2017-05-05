public class Punkt {
    int x;
    int y;
    void zwiekszXoJeden() {
        x++;
    }
    
    void zwiekszYoJeden() {
        y++;
    }
    int podajX() {
        return x;
    }

    int podajY() {
        return y;
    }

    void wyswietl() {
        System.out.println(x);
        System.out.println(y);
    }
    
    void zwiekszXo(int ile) {
        x += ile;
    }

    void zwiekszYo(int ile) {
        y += ile;
    }
}
