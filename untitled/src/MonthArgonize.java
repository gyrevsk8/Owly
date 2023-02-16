
public class MonthArgonize {
    String[] months;

    {
        months = new String[12];


    }
    String [][] data = new String[4][2];

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

        data [0][0] = "check"; data[0][1]="check";
        data [1][0] = "check1";data [1][1] = "check1";
        data [2][0] = "check2";data [2][1] = "check2";
        data [3][0] = "check3";data [3][1] = "check3";

    }
 String[] monthsr()
    {
        return months;
    }
    String getmonth(int index)
    {
        return months[index];
    }
    String getdata(int indexx,int index)
    {
        return data[index][indexx];
    }
    void setData(int indexx,int index, String inf)
    {
        data[index][indexx]=inf;
    }
}