public class longestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        int prefixLen = prefix.length();
        
        for(int i=1; i<strs.length; i++){
            String s = strs[i];
            while(prefixLen > s.length() || !prefix.equals(s.substring(0,prefixLen))){
                prefixLen--;
                if(prefixLen == 0) return "";
                prefix = prefix.substring(0,prefixLen);
            }
        }

        return prefix;

        // II Method

        // String prefix = strs[0];

        // for (int i = 1; i < strs.length; i++) {
        //     while (strs[i].indexOf(prefix) != 0) {
        //         prefix = prefix.substring(0, prefix.length() - 1);
        //         if (prefix.isEmpty()) {
        //             return "";
        //         }
        //     }
        // }

        // return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String commonPrefix = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }

}