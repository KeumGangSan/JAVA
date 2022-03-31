
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice1 extends JFrame{
	public Practice1() {
		super("JComponenet의 공통 메소드 예재");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button"); /*생성자 호출*/
		JButton b2 = new JButton(" Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW); //백경색 설정
		b1.setForeground(Color.MAGENTA); //글자색 설정
		b1.setFont(new Font("Arial", Font.ITALIC,20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				Practice1 frame = (Practice1)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY());
			}
		});
		
		c.add(b1); c.add(b2); c.add(b3);
		
		setSize(260,200);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new Practice1();
		

	}

}
