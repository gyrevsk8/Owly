
public class MonthArgonize {
    String[] months;

    {
        months = new String[12];

    }

    MonthArgonize() {

        months[0] = "январь";
        months[1] = "февраль";
        months[2] = "март";
        months[3] = "апрель";
        months[4] = "май";
        months[5] = "июнь";
        months[6] = "июль";
        months[7] = "август";
        months[8] = "сентябрь";
        months[9] = "октябрь";
        months[10] = "ноябрь";
        months[11] = "декабрь";


    }
 String[] monthsr()
    {
        return months;
    }
    String getmonth(int index)
    {
        return months[index];
    }
}