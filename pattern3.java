//Wednesday (20-09-2023)

import java.util.*;
class pattern3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pascleTriangle(n);
	}
	public static void pascleTriangle(int n){
		for(int i=1; i<=n; i++){
			for(int j=0; j<=n-i; j++){
				System.out.print(" ");
			}
			int x=1;
			for(int k=1; k<=i;k++){
				System.out.print(x + " ");
				x = x*(i-k)/k;
			}
			System.out.println();
		}	
	}
}	
