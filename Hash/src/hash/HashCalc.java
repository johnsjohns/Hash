package hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCalc {
	private String senha;
	private String senhahex;
	private String[] codes;

	public HashCalc() {
		senha = "teste";
		senhahex = "";
		codes = new String[4];
		
		codes[0] = calcula("SHA-1");
		codes[1] = calcula("SHA-256");
		codes[2] = calcula("SHA-384");
		codes[3] = calcula("SHA-512");
		
		for (String codigo : codes) {
			System.out.println(codigo);
		}
	}
	
	public static void main(String args[]) {
	
		HashCalc calc = new HashCalc();
	}
	
	private String calcula(String hashCode) {
		 MessageDigest md;
			try {
				  MessageDigest algorithm = MessageDigest.getInstance(hashCode);
	              byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

	              StringBuilder hexString = new StringBuilder();
	              for (byte b : messageDigest) {
	                hexString.append(String.format("%02X", 0xFF & b));
	              }
	              senhahex = hexString.toString();


 
			} catch (NoSuchAlgorithmException|UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				System.out.println("Erro no bloco de calculo");
				e.printStackTrace();
			} 
			return senhahex;
		
	}
	
	

}
