package hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCalc {

	public HashCalc() {
		
	}
	public static void main(String args[]) {
		String senha = "teste";

        MessageDigest md;
		try {
			  MessageDigest algorithm = MessageDigest.getInstance("SHA-1");
              byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

              StringBuilder hexString = new StringBuilder();
              for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
              }
              String senhahex = hexString.toString();

              System.out.println(senhahex.toLowerCase());
              
		      System.out.println("2e6f9b0d5885b6010f9167787445617f553a735f"); 
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

        
	}
	
	

}
