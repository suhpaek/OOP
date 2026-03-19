package task3.a;

public class App {
    public void getStatistics(Game g){
        g.a();
        g.b();
        g.c();

        if(g instanceof IGame){
            ((IGame) g).d();
        }
    }

    public static void main(String[] args){
        App app = new App();

        Game g1 = new LogicGame();
        Game g2 = new MemoryGame();

        app.getStatistics(g1);
        System.out.println();

        app.getStatistics(g2);
    }
}
