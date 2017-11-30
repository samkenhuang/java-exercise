package com.leetcode.contest60;

/**
 * Created by huangxin on 2017/11/26.
 */
public class SentenceSimilarity {
    public static void main(String[] args) {
        SolutionSentenceSimilarity s = new SolutionSentenceSimilarity();
        String[] words1 = {"great","acting","skills"};
        String[] words2 = {"great","drama","talent"};
        String[][] k = {{"great", "fine"}, {"drama","acting"}, {"skills","talent"}};
        System.out.println(s.areSentencesSimilar(words1, words2,  k));
    }
}

class SolutionSentenceSimilarity {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) return false;
        for (int i = 0; i < words1.length; i ++) {
            boolean found = false;
            if (words1[i].equals(words2[i])) {
                found = true;
            } else {
                for (int x = 0; x < pairs.length; x ++) {
                    if ((pairs[x][0].equals(words1[i]) && pairs[x][1].equals(words2[i])) || (pairs[x][1].equals(words1[i]) && pairs[x][0].equals(words2[i]))) {
                        found = true;
                        break;
                    }
                }
            }
            if (!found) return false;
        }
        return true;
    }
}