import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class DynamicMandelbrotSet extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int MAX_ITER = 1000;
    private static final double INITIAL_ZOOM = 200;
    private static final double ZOOM_SPEED = 0.1; // 확대 속도 조절을 위한 변수
    private static double zoom = INITIAL_ZOOM;
    private static final int INTERVAL = 100; // 확대 간격(ms)

    public DynamicMandelbrotSet() {
        super("Dynamic Mandelbrot Set");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        Timer timer = new Timer(INTERVAL, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zoom *= (1 + ZOOM_SPEED); // 확대 속도에 따라 zoom 값 조절
                repaint();
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        DynamicMandelbrotSet mandelbrotSet = new DynamicMandelbrotSet();
        mandelbrotSet.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                double zx = 0;
                double zy = 0;
                double cx = (x - WIDTH / 2.0) / zoom;
                double cy = (y - HEIGHT / 2.0) / zoom;
                int iter = MAX_ITER;
                while (zx * zx + zy * zy < 4 && iter > 0) {
                    double temp = zx * zx - zy * zy + cx;
                    zy = 2 * zx * zy + cy;
                    zx = temp;
                    iter--;
                }
                image.setRGB(x, y, iter | (iter << 8));
            }
        }
        g.drawImage(image, 0, 0, this);
    }
}
