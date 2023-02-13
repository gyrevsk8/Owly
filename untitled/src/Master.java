public class Master implements Runnable {//стандартный класс-программа
    Master() {
        WinSet win = new WinSet();
        win.setdate("0.0.1980");
        win.setindex(0);
        GUI gui = new GUI(win);
        gui.show();
    }
    public void run()
    {

    }



}
