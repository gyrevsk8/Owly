import javax.swing.table.AbstractTableModel;

public class TableAbs extends AbstractTableModel {

    private String[] columnNames =    // ...//same as before...
    private Object[][] data =  null;   //...//same as before...

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
