package hash.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hash.HashCalc;

public class Painel extends JPanel {
	
	JLabel entradaLbl, lblMd5, lblSha1, lblSha256, lblSha384, lblSha512;
	JTextField entradaTxt, txtMd5, txtSha1, txtSha256, txtSha384, txtSha512;

	public Painel() {
		
		int tamanho = 100;
		this.setLayout(new GridLayout(7,1));
		Dimension dimensao = new Dimension(70,10);
				
		entradaLbl = new JLabel("Texto: ");
		entradaLbl.setPreferredSize(dimensao);
		entradaTxt = new JTextField(tamanho);
		
		JPanel entrada = new JPanel(new FlowLayout(FlowLayout.LEFT));
		entrada.add(entradaLbl);
		entrada.add(entradaTxt);
		add(entrada);
		
		lblMd5 = new JLabel("MD5:");
		lblMd5.setPreferredSize(dimensao);
		txtMd5 = new JTextField(tamanho);
		JPanel md5Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		md5Panel.add(lblMd5);
		md5Panel.add(txtMd5);
		add(md5Panel);
		
		lblSha1 = new JLabel("SHA-1:");
		lblSha1.setPreferredSize(dimensao);
		txtSha1 = new JTextField(tamanho);
		JPanel sha1Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		sha1Panel.add(lblSha1);
		sha1Panel.add(txtSha1);
		add(sha1Panel);
		
		lblSha256 = new JLabel("SHA-256:");
		lblSha256.setPreferredSize(dimensao);
		txtSha256 = new JTextField(tamanho);
		JPanel sha256Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		sha256Panel.add(lblSha256);
		sha256Panel.add(txtSha256);
		add(sha256Panel);
		
		lblSha384 = new JLabel("SHA-384:");
		lblSha384.setPreferredSize(dimensao);
		txtSha384 = new JTextField(tamanho);
		JPanel sha384Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		sha384Panel.add(lblSha384);
		sha384Panel.add(txtSha384);
		add(sha384Panel);

		lblSha512 = new JLabel("SHA-512:");
		lblSha512.setPreferredSize(dimensao);
		txtSha512 = new JTextField(tamanho);
		JPanel sha512Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		sha512Panel.add(lblSha512);
		sha512Panel.add(txtSha512);
		add(sha512Panel);
		
		adicionaListener();

	}

	public Painel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public Painel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public Painel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
	
	public void adicionaListener() {
		entradaTxt.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				//Conforme o usuario vai digitando o texto, o programa calcula o hash
				HashCalc calcula = new HashCalc(entradaTxt.getText());
				escreveTxt(calcula.getHash());
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	private void escreveTxt(String dados[]) {
		//pega os dados do Array de Hash e escreve nos devidos campos
		txtMd5.setText(dados[0]);
		txtSha1.setText(dados[1]);
		txtSha256.setText(dados[2]);
		txtSha384.setText(dados[3]);
		txtSha512.setText(dados[4]);
		
	}
}
