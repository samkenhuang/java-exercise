package network.thread;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.*;

// 我这边轮询的方法无法得到结果
/**
 * Created by huangxin on 2017/5/15.
 */
public class ReturnDigest extends Thread {

    private String filename;
    private byte[] digest;

    public ReturnDigest(String filename) {
        this.filename = filename;
    }

    public byte[] getDigest() {
        return digest;
    }

    @Override
    public void run() {
        try {
            FileInputStream in = new FileInputStream(filename);
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            DigestInputStream din = new DigestInputStream(in, sha);
            while (din.read() != -1) ;
            din.close();
            digest = sha.digest();
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (NoSuchAlgorithmException ex) {
            System.err.println(ex);
        }
    }

}
