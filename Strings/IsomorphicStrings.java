import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (hm.containsKey(cs)) {
                if (hm.get(cs) != ct) {
                    return false;
                }
            } else if (hm.containsValue(ct)) { // if ct is already mapped to another character
                return false;                  // then it should not be mapped to another character cs
            }
            hm.put(cs,ct);
        }

        return true;
    }

    // II Method
    // public static boolean isIsomorphic(String s, String t) {
    //     if(s.length() != t.length()) return false;
    //     int[] mapS = new int[256];
    //     int[] mapT = new int[256];
    //     for(int i=0; i<s.length(); i++){
    //         char chS = s.charAt(i);
    //         char chT = t.charAt(i);
    //         if(mapS[chS] != mapT[chT]){
    //             return false;
    //         }
    //         mapS[chS] = i + 1;
    //         mapT[chT] = i + 1;
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s, t);
        if(result)    System.out.println("Yes, the strings are isomorphic");
        else    System.out.println("No, the strings are not isomorphic");
    }

}