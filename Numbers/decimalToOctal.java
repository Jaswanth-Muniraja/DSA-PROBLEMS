public class decimalToOctal {

    public static void decimal_to_octal(int decimal){
        int[] octal = new int[30];
        int i =0;
        while(decimal > 0){
            int reminder = decimal % 8;
            octal[i++] = reminder;
            decimal = decimal/8;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(octal[j]+"");
        }
    }

    // II Method
    // public static void decimal_to_octal(int decimal){
    //     StringBuilder octal = new StringBuilder();
    //     while(decimal>0)
    //     {
    //         int reminder = decimal % 8;
    //         octal.append(reminder);
    //         decimal = decimal / 8;

    //     }
    //     System.out.println(octal.reverse());
    // }

    public static void main(String[] args) {
        int decimal = 214;
        decimal_to_octal(decimal);
    }
}
