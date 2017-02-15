package LeetCode.KeyboardRows;

// Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard

public class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> keyWords = new ArrayList<>();
        String[] keys = new String[] {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<String, Integer> map = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < keys.length; i++) {
            for (char c : keys[i].toCharArray()) {
                map.put(String.valueOf(c), i);
            }
        }
        for (String s : words) {
            char[] c = s.toCharArray();
            int row = map.get(String.valueOf(c[0]));
            for (int i = 0; i < c.length; i++) {
                if (map.get(String.valueOf(c[i])) != row) {
                    row = -1;
                    break;
                }
            }
            if (row != -1) {
                keyWords.add(s);
            }
        }
        return keyWords.toArray(new String[0]);
    }
}