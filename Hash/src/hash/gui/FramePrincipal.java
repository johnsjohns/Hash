package hash.gui;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

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
		
		Painel painel = new Painel();
		FramePrincipal frame = new FramePrincipal("Hash Generator");
		frame.setLayout(new BorderLayout());
		frame.getContentPane().add(painel, BorderLayout.NORTH);
		frame.setVisible(true);
		frame.setSize(1200, 220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}
