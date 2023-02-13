public class WinSet {// маленький класс-массив, нужен для задания параметров окна, содержит дату для демонстрации и какой-то индекс
    private String date;
    private int index;

    void setdate(String str){
        date = str;
    }

    void setindex(int i)
    {
        index = i;
    }
    String getdate(){
       return  this.date;
    }

    int getindex()
    {
        return this.index;
    }
}
