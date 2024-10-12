class Solution {
    public static int lengthOfLastWord(String s) {
        String [] words = s.split(" ");
        String lastWord = words[words.length-1];
        return lastWord.length();
    }

}