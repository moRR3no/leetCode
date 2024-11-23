package main.java.org.example;

public class MergeStringAlternately {

    // better solution
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

//    public String mergeAlternately(String word1, String word2) {
//        char[] wordUn = word1.toCharArray();
//        char[] wordDos = word2.toCharArray();
//        int totalLength = word1.length() + word2.length();
//        List<Character> endWord = new ArrayList<>();
//
//        for (int i = 0; i < totalLength; i++) {
//            if (i <= wordUn.length-1) {
//                endWord.add(wordUn[i]);
//            }
//            if (i <= wordDos.length-1) {
//                endWord.add(wordDos[i]);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < totalLength; i++) {
//            sb.append(endWord.get(i));
//        }
//
//        return sb.toString();
//    }
}
