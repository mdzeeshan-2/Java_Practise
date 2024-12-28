public class h16 {
    public static void main(String[] args) {
        int numbers[]={1,53,63,71,82, 92};
        int min=Integer.MAX_VALUE;
        for (int number : numbers) {
            if(min>number){
                min = number;
            }
        }
        System.out.println("The Smallest number is: " +min);
    }
}
