package subject.statistics;

import java.util.BitSet;

/**
 * Created by huangxin on 2017/5/5.
 */
public class Cardinality {
    public static BitSet BitMap(int[] data) {
        BitSet res = new BitSet(6);
        for (int i = 0; i < data.length; i ++) {
            res.set(data[i], true);
        }
        return res;
    }

    public static BitSet HyperLogLog(int[] data) {
        BitSet res = new BitSet(100000);
        for (int i = 0; i < data.length; i ++) {
            res.set(data[i], true);
        }
        return res;
    }

    public static void main(String[] args) {
        BitSet bs = BitMap(new int[]{1,2,3,4,4,2,1,4,5,6,7,8,9,11,12,1,1,2,3});
        System.out.println(bs.length());
    }
}
