import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Parcheggio p = new Parcheggio(4);
        ArrayList<Auto> auto = new ArrayList<>();
        for (int i = 0; i < 8; i++)
        {
            auto.add(new Auto("Auto "+ (i+1)+"",p));
        }
        for (Auto a: auto)
        {
            a.start();
        }
    }
}