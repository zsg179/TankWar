import java.awt.*;

/**
 * @Auther :朱树广
 * @Date :2020/4/2
 * @Description :PACKAGE_NAME
 * @Version :1.0
 */
public class TankClient extends Frame {

    public void launchFrame() {
        this.setLocation(400, 300);
        this.setSize(800,600);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        TankClient tc = new TankClient();
        tc.launchFrame();
    }
}
