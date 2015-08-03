package com.tonitassani.encryptor;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.binary.Base64;

public class Encryptor {

	public static void main(String[] args) throws Exception {
		Encryptor encryptor = new Encryptor();
		encryptor.process();
	}

	private void process() throws Exception {
		String publicKeyAsText = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgi9PpaOk210GWgUNn2Xu"
				+ "cmhBhZJ9/dTysE2Z9/jcQoUhkUs88AOnETStxMbK0hANTGvVRhifDxZuB9T+J3Rb"
				+ "wsxQIfF3etjkYbav/eUZ3d7XQ5wUkG1jr+UNKAC8jU2DWHk8n5/XjCd6F8vnnf+4"
				+ "7AsuXON+m+yY3akT9eBI+cOTEjmHCUTviV0vebxUfUYjFJqDSI5w9q/eBOB7dl7t"
				+ "WLRyVN6UCw/bOpIhq9jxkJIuQ64PZ2zfdTU/XiEiDnwKy/a/QukH2Gan1poP2V3Z"
				+ "SKS7aEkgzjVqq9JfKcGHAb3byROb7i2OW7XcaI3p5UP0yv/2gd98dgzYgabYoik3" //
				+ "6wIDAQAB";
		PublicKey publicKey = readPublicKey(publicKeyAsText);
		byte[] result = encrypt(
				"id:4D1234;channel:CHA_TEST;appId:APP_TEST;center:12345;requestUser:U0199999;timestamp:20150403175241",
				publicKey);
		System.out.println(new String(Base64.encodeBase64(result)));
	}

	private PublicKey readPublicKey(String key) throws NoSuchAlgorithmException, InvalidKeySpecException {
		byte[] decodedKey = Base64.decodeBase64(key.getBytes());
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		return keyFactory.generatePublic(new X509EncodedKeySpec(decodedKey));
	}

	public byte[] encrypt(String text, Key key) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		return cipher.doFinal(text.getBytes());
	}

}
