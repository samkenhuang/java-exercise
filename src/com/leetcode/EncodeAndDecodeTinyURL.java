package com.leetcode;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by huangxin on 2017/4/6.
 * https://leetcode.com/problems/encode-and-decode-tinyurl/#/description
 */
public class EncodeAndDecodeTinyURL {
    public static void main(String[] args) {
        SolutionEncodeAndDecodeTinyURL s = new SolutionEncodeAndDecodeTinyURL();
        System.out.println(s.encode("http://www.baidu.com"));
        System.out.println(s.decode(s.encode("http://www.baidu.com")));
        System.out.println(s.encode("http://www.google.com"));
        System.out.println(s.decode(s.encode("http://www.google.com")));
    }
}

class SolutionEncodeAndDecodeTinyURL {
    public static HashMap<String, String> db = new HashMap<String, String>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(db.containsValue(longUrl)) {
            Iterator iter = db.keySet().iterator();
            while (iter.hasNext()) {
                Object key = iter.next();
                if (db.get(key) == longUrl) {
                    return key.toString();
                }
            }
        }
        String subset = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String res = "";
        int i = 0;
        while (i < 6) {
            double randomPos = Math.floor(Math.random() * subset.length());
            int pos = (int)randomPos;
            res = res.concat(subset.substring(pos, pos + 1));
            i ++;
        }
        if(! db.containsKey(res)) {
            db.put(res, longUrl);
            return res;
        } else {
            encode(longUrl);
        }
        return "";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if(db.containsKey(shortUrl)) {
            return db.get(shortUrl);
        } else {
            return "";
        }
    }
}
