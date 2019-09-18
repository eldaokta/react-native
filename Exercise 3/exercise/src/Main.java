import com.enigma.model.Heroes;

public class Main {
    public static void main(String[] args) {
        Heroes gundala = new Heroes(100, 100, 15);
        Heroes saitama = new Heroes(1000, 500, 50);

        gundala.attack(saitama);
        System.out.println(gundala.print());
        System.out.println(saitama.print());

    }
}
