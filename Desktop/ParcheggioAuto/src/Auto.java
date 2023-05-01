public class Auto extends Thread{
    private Parcheggio p;

    public Auto(String name, Parcheggio p) {
        this.p = p;
    }

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "sta per trovare il parcheggio");
        p.parcheggiaAuto(Thread.currentThread());
        System.out.println(Thread.currentThread().getName()+"ha finito la sosta");
    }
}
