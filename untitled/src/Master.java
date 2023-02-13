import java.util.Date;

public class Master implements Runnable {//стандартный класс-программа
    Master() {
        WinSet win = new WinSet();
        Date date = new Date();
        win.setdate(date.toString());
        win.setindex(0);
        GUI gui = new GUI(win);
        gui.show();
    }
    public void run()
    {

    }



}
