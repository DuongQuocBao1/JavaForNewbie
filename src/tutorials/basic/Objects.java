package tutorials.basic;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		int height = 400;
		String str = "Hi, this is my label";
		JFrame window = new JFrame();
		window.setTitle("My Frame");
		window.setSize(800, height);
		window.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText(str);
		window.add(label);
	}
}
