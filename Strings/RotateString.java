class RotateString{

    public boolean rotateString(String s, String goal) { // check if, by rotating(left) s, can we get goal
        if(s.length() != goal.length()) return false;
        int j =0;
        String str = s;
        while(j < s.length()){
            char ch = str.charAt(0);
            str = str.substring(1,s.length())+ch;
            if(str.equals(goal)) return true;
            j++;
        }
        return false;
    }

    // II Method
    // public boolean rotateString(String s, String goal) {
    //     if (s.length() != goal.length()) {
    //         return false;
    //     }
    //     String doubled = s + s;
    //     return doubled.contains(goal);
    // }

    // III Method
    // public boolean rotateString(String s, String goal) {
    //     if(s.length()!=goal.length()) return false;
    //     int n=s.length();
    //     for(int i=0;i<n;i++){
    //         String rev=s.substring(i)+s.substring(0,i);
    //         if(rev.equals(goal)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        RotateString rs = new RotateString();
        String s = "abcde";
        String goal = "cdeab";
        boolean result = rs.rotateString(s, goal);
        if(result){
            System.out.println("Yes, we can get goal by rotating s");
        }else{
            System.out.println("No, we cannot get goal by rotating s");
        }
    }

}