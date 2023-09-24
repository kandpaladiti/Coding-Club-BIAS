//Thursday (21-09-2023)

import java.util.*;
class pattern4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Butterflypattern(n);
	}
	public static void Butterflypattern(int n){
		//upper half
		//left part
		for(int i=1; i<=n;i++){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}	
			//spaces
			for(int j=1; j<=2*(n-i); j++){
				System.out.print("  ");
			}
			//right part
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		//lower half
		//left part
		for(int i=n; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			//spaces
			for(int j=1; j<=2*(n-i);j++){
				System.out.print("  ");
			}
			//right part
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}	
