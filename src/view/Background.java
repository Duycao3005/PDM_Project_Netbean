import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Background extends JPanel {

    private Image bg;

    public Background() {
        setLayout(new BorderLayout());

        // load ảnh từ resource
        URL url = getClass().getResource("/Imaga/Image.jpg");

        if (url != null) {
            bg = new ImageIcon(url).getImage();
            System.out.println("✅ Load ảnh thành công");
        } else {
            System.out.println("❌ Không tìm thấy ảnh");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // nền sáng nhẹ
        g2.setColor(new Color(245, 248, 252));
        g2.fillRect(0, 0, getWidth(), getHeight());

        if (bg != null) {
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.08f));

            int w = 300;
            int h = 300;

            g2.drawImage(bg, getWidth() - w , getHeight() - h, w, h, this);
        }
    }
}