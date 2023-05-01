import static java.lang.Thread.sleep;

public class Parcheggio {
    private int postiauto;
    private int postiocc = 0;
    private boolean full = false;

    public Parcheggio(int postiauto) {
        this.postiauto = postiauto;
    }
    public void parcheggiaAuto(Thread currentThread)
    {
        try{
            while(full)
            {
                int wait = (int) (Math.random()*10000)+1;
                System.out.println(currentThread.getName()+"aspetta per: "+ wait + "ms");
                wait(wait);
            }
            postiocc++;
            if(postiocc>=postiauto)
            {
                full = true;
                System.out.println("Tutti i posti sono occupati");
            }
            int tempoSosta = (int) (Math.random()*5000)+1;
            System.out.println(currentThread.getName() + "occupa il posto per: " + tempoSosta + "ms");
            sleep(tempoSosta);
            postiocc--;
            if(postiocc<postiauto)
            {
                full = false;
                System.out.println("Ci sono ancora dei posti liberi");
            }
            notify();
        } catch (Exception ignored) {
        }
    }

}
