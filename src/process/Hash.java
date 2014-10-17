package process;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;

public class Hash {

    final static int NUMBER_MD5 = 0;
    final static int NUMBER_SHA1 = 1;
    final static int NUMBER_SHA2 = 2;

    private FileInputStream[] fin = { null, null, null };

    public Hash(File file) {
        try {
            this.fin[NUMBER_MD5]  = new FileInputStream(file);
            this.fin[NUMBER_SHA1] = new FileInputStream(file);
            this.fin[NUMBER_SHA2] = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getMD5() {
        byte[] digest = null;
        try {

            // Obtain a message digest object
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] buffer = new byte[8192];
            int length;

            while ((length = this.fin[NUMBER_MD5].read(buffer)) != -1)
                md.update(buffer, 0, length);

            digest = md.digest();

        } catch (java.io.IOException e) {
        } catch (java.security.NoSuchAlgorithmException e) {
        }

        return Hex.encodeHexString(digest);
    }

    public String getSHA1() {
        byte[] digest = null;
        try {

            // Obtain a message digest object.
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            byte[] buffer = new byte[8192];
            int length;

            while ((length = this.fin[NUMBER_SHA1].read(buffer)) != -1)
                md.update(buffer, 0, length);

            digest = md.digest();

        } catch (java.io.IOException e) {
        } catch (java.security.NoSuchAlgorithmException e) {
        }

        return Hex.encodeHexString(digest);
    }

    public String getSHA256() {
        byte[] digest = null;
        try {

            // Obtain a message digest object.
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] buffer = new byte[8192];
            int length;

            while ((length = this.fin[NUMBER_SHA2].read(buffer)) != -1)
                md.update(buffer, 0, length);

            digest = md.digest();

        } catch (java.io.IOException e) {
        } catch (java.security.NoSuchAlgorithmException e) {
        }

        return Hex.encodeHexString(digest);
    }
}
