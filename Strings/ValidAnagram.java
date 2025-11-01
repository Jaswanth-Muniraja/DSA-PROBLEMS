import java.util.HashMap;

class  ValidAnagram{

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // II Method
    // public boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length()) return false;
    //     HashMap<Character, Integer> hs = new HashMap<>();
    //     for(int i=0; i<s.length(); i++){
    //         char cs = s.charAt(i);
    //         hs.put(cs, hs.getOrDefault(cs, 0)+1);
    //     }
    //     for(int i=0; i<t.length(); i++){
    //         char ct = t.charAt(i);
    //         if(!hs.containsKey(ct) || hs.get(ct) == 0){
    //             return false;
    //         }
    //         hs.put(ct, hs.get(ct)-1);
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = va.isAnagram(s, t);
        if (result)
            System.out.println("Yes, the strings are anagrams");
        else
            System.out.println("No, the strings are not anagrams");
    }

}