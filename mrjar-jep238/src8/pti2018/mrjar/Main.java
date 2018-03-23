package pti2018.mrjar;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String input = "Hello World!";
		MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
        msdDigest.update(input.getBytes(StandardCharsets.UTF_8), 0, input.length());
        String sha1 = DatatypeConverter.printHexBinary(msdDigest.digest());
		System.out.println("sha1: " + sha1);
	}
}
