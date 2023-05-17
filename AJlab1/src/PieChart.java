import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PieChart extends JPanel {

    private static final long serialVersionUID = 1L;

    private static final int[] DATA = { 40, 20, 10, 30 };
    private static final String[] LABELS = { "A", "B", "C", "D" };
    private static final Color[] COLORS = { Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE };

    private static final int SIZE = 300;
    private static final int MARGIN = 20;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        double total = 0.0;
        for (int i = 0; i < DATA.length; i++) {
            total += DATA[i];
        }

        double start = 0.0;
        for (int i = 0; i < DATA.length; i++) {
            double extent = DATA[i] / total * 360.0;
            g2d.setColor(COLORS[i]);
            g2d.fill(new Arc2D.Double(MARGIN, MARGIN, SIZE - 2 * MARGIN, SIZE - 2 * MARGIN, start, extent, Arc2D.PIE));
            start += extent;
        }

        double cx = SIZE / 2.0;
        double cy = SIZE / 2.0;
        double r1 = (SIZE - 2 * MARGIN) / 2.0;
        double r2 = (SIZE - 2 * MARGIN) / 3.0;
        Area area1 = new Area(new Ellipse2D.Double(cx - r1, cy - r1, r1 * 2, r1 * 2));
        Area area2 = new Area(new Ellipse2D.Double(cx - r2, cy - r2, r2 * 2, r2 * 2));
        area1.subtract(area2);
        g2d.setColor(Color.WHITE);
        g2d.fill(area1);

        double y = MARGIN;
        for (int i = 0; i < DATA.length; i++) {
            g2d.setColor(COLORS[i]);
            g2d.fill(new Rectangle2D.Double(SIZE - MARGIN * 2, y, MARGIN, MARGIN));
            g2d.setColor(Color.BLACK);
            g2d.drawString(LABELS[i], SIZE - MARGIN * 2 + MARGIN / 2, (int)(y + MARGIN / 2)); // cast y to int
            y += MARGIN;
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pie Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SIZE + MARGIN * 3, SIZE + MARGIN * 2);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new PieChart());
        frame.setVisible(true);
    }
}
