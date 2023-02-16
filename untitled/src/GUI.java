import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.Vector;

public class GUI extends JFrame {//гуи, принимает в себя винсет с данными

    GUI(WinSet win) {
        super(win.getdate());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(960, 240, 400, 600);
        MonthArgonize monthArgonize = new MonthArgonize();
        //  this.setShape(new RoundRectangle2D.Double(0,0,this.getWidth(),this.getHeight(),20,20) );
        Vector v = new Vector<>();
        TableModel tableModel = new TableModel() {

            @Override
            public int getRowCount() {
                return 1;
            }

            @Override
            public int getColumnCount() {
                return 2;
            }

            @Override
            public String getColumnName(int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return "Антон";
                    case 1:
                        return "Никита";
                    case 2:
                        return "Омар";
                }
                return "";
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return String.class;
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return true;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                return monthArgonize.getdata(columnIndex);
            }

            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                    monthArgonize.setData(columnIndex,aValue.toString());
            }

            @Override
            public void addTableModelListener(TableModelListener l) {

            }

            @Override
            public void removeTableModelListener(TableModelListener l) {

            }
        };

        JTable jTable = new JTable(tableModel);
        Container boks = new Container();
        jTable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                jTable.setBackground(Color.green);
                boks.setBackground(Color.red);
                jTable.revalidate();
                jTable.setOpaque(true);
                getRootPane().setBackground(Color.GREEN);
                getContentPane().setBackground(Color.GREEN);
                getContentPane().revalidate();
                getRootPane().revalidate();
                getRootPane().getGraphics().setColor(Color.GREEN);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                boks.setBackground(Color.white);
                jTable.setBackground(Color.white);
                jTable.revalidate();
                jTable.setOpaque(true);
            }
        });


        Box container = new Box(BoxLayout.Y_AXIS);
        jTable.editCellAt(1, 1);
        jTable.setRowHeight(30);
        jTable.setRowHeight(1, 20);
        jTable.setIntercellSpacing(new Dimension(10, 10));
        jTable.setGridColor(Color.blue);
        jTable.setRowHeight(35);
        boks.setMaximumSize(new Dimension(300, 300));
        boks.setLayout(new BorderLayout());
        JScrollPane jScrollPane = new JScrollPane();
        boks.add(new JScrollPane(jTable));
        jScrollPane.add(boks);
        JLabel jlabel = new JLabel("NNNNN");
        jScrollPane.add(jlabel);
        container.add(jScrollPane);
        setContentPane(boks);


    }
}

