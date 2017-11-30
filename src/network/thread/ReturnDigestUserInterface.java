package network.thread;

import javax.xml.bind.DatatypeConverter;

/**
 * Created by huangxin on 2017/5/15.
 */
public class ReturnDigestUserInterface {
    public static void main(String[] args) {
        ReturnDigest[] digests = new ReturnDigest[args.length];
        for (int i = 0; i < args.length; i ++) {
            digests[i] = new ReturnDigest(args[i]);
            digests[i].start();
        }

        for (int i = 0; i < args.length; i ++) {
            while (true) {
                byte[] digest = digests[i].getDigest();
                if (digest != null) {
                    StringBuffer result = new StringBuffer(args[i]);
                    result.append(":");
                    result.append(DatatypeConverter.printHexBinary(digest));
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}
