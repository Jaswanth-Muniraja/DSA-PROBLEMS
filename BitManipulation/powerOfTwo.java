class powerOfTwo{
    public static void main(String[] args){
        int number = 16; 
        if ((number & (number - 1)) == 0) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }   
    }
}