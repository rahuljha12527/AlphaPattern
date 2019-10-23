import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                //int k=j;
                char c=(char)('A'+i-1);
                System.out.print(c);
                j++;
            }
            i++;
            System.out.print("\n");
            
        }
		
	}

}
