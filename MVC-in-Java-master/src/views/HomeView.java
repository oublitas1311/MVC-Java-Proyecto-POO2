package views;

import javax.swing.*;
import java.awt.Dimension;

import controllers.HomeController;
import core.Model;
import core.View;

@SuppressWarnings("serial")
public class HomeView extends JPanel implements View
{
	//-----------------------------------------------------------------------
	// Attributes
	//-----------------------------------------------------------------------
	private HomeController homeController;
	private JFrame mainFrame;

	private JTextField txtDescripcion;
	private JTextField txtEmail;
	private JButton btnGuardar;

	private final static int MAIN_FRAME_WIDTH = 800;
	private final static int MAIN_FRAME_HEIGHT = 500;
	private final static int MAIN_FRAME_X = 100;
	private final static int MAIN_FRAME_Y = 100;

	//-----------------------------------------------------------------------
	// Constructor
	//-----------------------------------------------------------------------
	public HomeView(HomeController homeController, JFrame mainFrame)
	{
		this.homeController = homeController;
		this.mainFrame = mainFrame;

		make_mainFrame();
		initComponents(); //
	}

	//-----------------------------------------------------------------------
	// Methods
	//-----------------------------------------------------------------------
	@Override
	public void update(Model model, Object data) {}

	private void make_mainFrame()
	{
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBounds(MAIN_FRAME_X, MAIN_FRAME_Y, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		mainFrame.setMinimumSize(new Dimension(MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT));
		mainFrame.setTitle("MVC-in-Java");
	}

	private void initComponents()
	{
		this.setLayout(null);

		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(50, 50, 200, 30);

		txtEmail = new JTextField();
		txtEmail.setBounds(50, 100, 200, 30);

		btnGuardar = new JButton("Guardar evento");
		btnGuardar.setBounds(50, 150, 120, 30);

		btnGuardar.addActionListener(e -> {
			String desc = txtDescripcion.getText();
			String email = txtEmail.getText();
			homeController.agregarEvento(desc, email);
		});

		this.add(txtDescripcion);
		this.add(txtEmail);
		this.add(btnGuardar);

		mainFrame.setContentPane(this);

		mainFrame.revalidate();
		mainFrame.repaint();
	}
}
