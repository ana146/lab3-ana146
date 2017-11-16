import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
     * 
     */
    private static final long serialVersionUID = 7057541440811488699L;
    public static void main(String[] args) {}
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                      //Paint the rectangles
                        g.setColor(Color.RED);
                        g.fillRect(0, 0, width+1, getHeight()/5);     //width +1 para que complete la linea del borde
                        g.fillRect(0, getHeight()*2/5, width+1, getHeight()/5);     //width +1  para que complete la linea del borde
                        g.fillRect(0, getHeight()*4/5, width+1, (getHeight()/5)+1); //width +1  para que complete la linea del borde
                      //Paint the triangles 
                        Polygon t = new Polygon();
                        t.addPoint(0,0);
                        t.addPoint(0,getHeight());
                        t.addPoint((getWidth()/2),(getHeight()/2));
                        g.setColor(Color.BLUE);
                        g.drawPolygon(t);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(t);
                      //Paint the star 
                        Polygon p2 = new Polygon();
                        p2.addPoint((getWidth()/7) + 25, (getHeight()/5) + 73);
                        p2.addPoint((getWidth()/7) + 41, (getHeight()/5) + 73);
                        p2.addPoint((getWidth()/7) + 47, (getHeight()/5) + 58);
                        p2.addPoint((getWidth()/7) + 53, (getHeight()/5) + 73);
                        p2.addPoint((getWidth()/7) + 69, (getHeight()/5) + 73);
                        p2.addPoint((getWidth()/7) + 56, (getHeight()/5) + 83);
                        p2.addPoint((getWidth()/7) + 61, (getHeight()/5) + 98);
                        p2.addPoint((getWidth()/7) + 47, (getHeight()/5) + 88);
                        p2.addPoint((getWidth()/7) + 34, (getHeight()/5) + 98);
                        p2.addPoint((getWidth()/7) + 38, (getHeight()/5) + 83);
                        g.setColor(Color.WHITE);
                        g.drawPolygon(p2);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);

                        
                        
            }
}