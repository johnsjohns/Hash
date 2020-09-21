package hash.gui;

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
		FramePrincipal fram = new FramePrincipal("Hash");
		

	}

}
