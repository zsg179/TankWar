import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @Auther :朱树广
 * @Date :2020/4/3
 * @Description :PACKAGE_NAME
 * @Version :1.0
 */
public class Tank {
    int x, y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30);
        g.setColor(c);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                x -= 5;
                break;
            case KeyEvent.VK_UP:
                y -= 5;
                break;
            case KeyEvent.VK_RIGHT:
                x += 5;
                break;
            case KeyEvent.VK_DOWN:
                y += 5;
                break;
        }
    }

}
