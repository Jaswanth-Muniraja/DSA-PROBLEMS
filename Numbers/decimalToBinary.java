public class decimalToBinary {

    public static void decimal_to_binary(int decimal){
        int[] binary = new int[30];
        int i =0;
        while(decimal > 0){
            int reminder = decimal % 2;
            binary[i++] = reminder;
            decimal = decimal/2;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(binary[j]+"");
        }
    }

    // II Method
    // public static void decimal_to_binary(int decimal){
    //     StringBuilder binary = new StringBuilder();
    //     while(decimal>0)
    //     {
    //         int reminder = decimal % 2;
    //         binary.append(reminder);
    //         decimal = decimal / 2;

    //     }
    //     System.out.println(binary.reverse());
    // }

    public static void main(String[] args) {
        int decimal = 85;
        decimal_to_binary(decimal);
    }
}
