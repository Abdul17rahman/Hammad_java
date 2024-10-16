/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myfiles;

import java.security.Security;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;


public class Encryption {
  
    
    byte [] input;
    byte [] keyBytes = "12345678".getBytes();
    byte [] ivBytes = "input123".getBytes();
     SecretKeySpec key = new SecretKeySpec(keyBytes,"DES");
     IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
     Cipher cipher;
     byte [] cipherText;
     int ctLength;
    
     public String Encrypt(String PlainText){
         String EncryptedText = null;
         try{
             Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
             input = PlainText.getBytes();
             SecretKeySpec key = new SecretKeySpec(keyBytes,"DES");
             IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
             cipher = Cipher.getInstance("DES/CTR/NoPadding", "BC");
             cipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);
             cipherText = new byte[cipher.getOutputSize(input.length)];
             ctLength = cipher.update(input, 0, input.length, cipherText, 0);
             ctLength += cipher.doFinal(cipherText, ctLength);
             EncryptedText = new String(cipherText);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
         return EncryptedText;
     }
}
