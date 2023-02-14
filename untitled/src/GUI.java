import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RoundRectangle2D;

public class GUI extends JFrame {//гуи, принимает в себя винсет с данными
        GUI(WinSet win)
        {
                super(win.getdate());
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setBounds(960,240,400,600);
              //  this.setShape(new RoundRectangle2D.Double(0,0,this.getWidth(),this.getHeight(),20,20) );
              JTable jTable = new JTable(3,6);
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

                jTable.editCellAt(1,1);
                jTable.setRowHeight(30);
                jTable.setRowHeight(1, 20);
                jTable.setIntercellSpacing(new Dimension(10, 10));
                jTable.setGridColor(Color.blue);
                jTable.setRowHeight(35);

                jTable.setTableHeader();
                boks.setMaximumSize(new Dimension(300,300));
                boks.setLayout(new BorderLayout());
                JScrollPane jScrollPane = new JScrollPane();
                 boks.add(new JScrollPane(jTable));
                  jScrollPane.add(boks);
                JLabel jlabel = new JLabel("NNNNN");
                jScrollPane.add(jlabel);
                container.add(jScrollPane);
                setContentPane(boks);



        }

