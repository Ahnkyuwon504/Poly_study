package main;

import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String before = "hello";
        String after = "";
        String key = "0123456789012345";
        // key = 012345678901****
        
        after = encrypt(key, before);
        
        System.out.println("Before : " + before);
        System.out.println("After : " + after);
        System.out.println("Decrypted : " + decrypt(key, after));
        
        for (int i = 0; i < 10000; i++) {
            String key2 = Integer.toString(i);
            
            if (key2.length() == 1) {
                key2 = "012345678901000" + key2;
            } else if (key2.length() == 2) {
                key2 = "01234567890100" + key2;
            } else if (key2.length() == 3) {
                key2 = "0123456789010" + key2;
            } else {
                key2 = "012345678901" + key2;
            }
            
            try {
                String plainTxt = decrypt(key2, "8Fuqc1va2xt8tBpJT9PslpVLUmOSKb87hACFaJd1GA0=");
                System.out.println(key2);
                System.out.println(plainTxt);
                
            } catch (Exception e) {
                continue;
            }
        }
    }
    
    public static String encrypt(String key, String text) {
        String cipherText = "";
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec ivspec = new IvParameterSpec(Arrays.copyOfRange(key.getBytes("UTF-8"), 0, cipher.getBlockSize()));
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes("UTF-8"), "AES"), ivspec);
            cipherText = new String(Base64.encodeBase64(cipher.doFinal(text.getBytes("UTF-8"))), "UTF-8");
            
        } catch (Exception e) {
            cipherText = "";
            e.printStackTrace();
        }
        return cipherText;
        
    }
    
    public static String decrypt(String key, String encryptedText) {
        String cipherText = "";
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            IvParameterSpec ivspec = new IvParameterSpec(Arrays.copyOfRange(key.getBytes("UTF-8"), 0, cipher.getBlockSize()));
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key.getBytes("UTF-8"), "AES"), ivspec);
            cipherText = new String(cipher.doFinal(Base64.decodeBase64(encryptedText.getBytes("UTF-8"))), "UTF-8");
            
        } catch (Exception e) {
            cipherText = "";
            e.printStackTrace();
        }
        return cipherText;
        
    }

}
