public class Solution {



    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        
        if(N%2==0)
        {
            if(N>=2 && N<=5)
                System.out.println("Not Weird");
            else if(N>=6 && N<=20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");        
        }
        else
        {
            System.out.println("Weird");
        }        
    }
}

