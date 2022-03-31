import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/image1.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/image2.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/image3.jpg");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		new LabelEx();

	}

}
