package hash.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FramePrincipal extends JFrame {

	public FramePrincipal() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public FramePrincipal(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public FramePrincipal(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public FramePrincipal(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		JPanel entrada = new JPanel(new FlowLayout());
		JLabel entradaLbl = new JLabel("Texto: ");
		JTextField entradaTxt = new JTextField("",30);
		entrada.add(entradaLbl);
		entrada.add(entradaTxt);
		
		FramePrincipal frame = new FramePrincipal("Hash");
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(entrada, BorderLayout.NORTH);
		

	}

}
