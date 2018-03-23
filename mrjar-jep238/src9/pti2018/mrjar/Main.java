package pti2018.mrjar;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String input = "Hello World!";
		MessageDigest msdDigest = MessageDigest.getInstance("SHA3-512");
        msdDigest.update(input.getBytes(StandardCharsets.UTF_8), 0, input.length());
        String sha3 = DatatypeConverter.printHexBinary(msdDigest.digest());
		System.out.println("sha3: " + sha3);
	}
}
