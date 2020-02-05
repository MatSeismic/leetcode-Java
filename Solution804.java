/** 804. Unique Morse Code Words */

class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--.." };
        Set<String> uniqueCode = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            String cur = "";
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                int asc = word.charAt(j);
                char temp = word.charAt(j);
                cur = cur + codes[asc - 97];
            }
            uniqueCode.add(cur);
        }

        return uniqueCode.size();
    }
}