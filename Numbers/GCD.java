class GCD{

    public static int GCD_of_two_numbers(int n1, int n2){
        if(n2 == 0) return n1;
        return GCD_of_two_numbers(n2, n1%n2);
    }

    // II Method 
    // public static int GCD_of_two_numbers(int n1, int n2){
    //     while(n1 > 0 && n2 > 0) {
    //         if(n1 > n2) {
    //             n1 = n1 % n2;
    //         }
    //         else {
    //             n2 = n2 % n1;
    //         }
    //     }
    //     if(n1 == 0) {
    //         return n2;
    //     }
    //     return n1;
    // }

    public static void main(String[] args) {
        int n1 = 48;
        int n2 = 90;
        System.out.println(GCD_of_two_numbers(n1,n2));
    }
}