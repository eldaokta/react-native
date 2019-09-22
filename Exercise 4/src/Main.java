import com.enigma.model.Heroes;

public class Main {
    public static void main(String[] args) {
    Heroes saitama = new Heroes(100, 60, 50);
    Heroes gundala = new Heroes(200, 50, 50);
    saitama.attack(gundala);
    System.out.println(saitama.print());
    System.out.println(gundala.print());
    gundala.healing(gundala);
    System.out.println(gundala.print());
    }
}
