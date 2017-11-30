package network.thread;

import javax.xml.bind.*;
/**
 * Created by huangxin on 2017/5/15.
 */
public class CallbackDigestUserInterface {
    public static void main(String[] args) {
        for (String filename : args) {
            CallbackDigest cb = new CallbackDigest(filename);
            Thread t = new Thread(cb);
            t.start();
        }
    }

    public static void receiveDigest(byte[] digest, String name) {
        StringBuffer result = new StringBuffer(name);
        result.append(":");
        result.append(DatatypeConverter.printHexBinary(digest));
        System.out.println(result);
    }
}
