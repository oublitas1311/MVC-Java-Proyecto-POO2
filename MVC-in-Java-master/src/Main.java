import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Prueba");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		JTextField txt = new JTextField();
		txt.setBounds(50, 50, 200, 30);

		JButton btn = new JButton("Guardar");
		btn.setBounds(50, 100, 120, 30);

		frame.add(txt);
		frame.add(btn);

		frame.setVisible(true);
	}
}