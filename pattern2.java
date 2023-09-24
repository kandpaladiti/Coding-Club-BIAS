import java.util.*;
class pattern2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row=1; row<=n;row++){
			for(int col=1; col<=row; col++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row=n-1; row>=1; row--){
			for(int col=1; col<=row; col++){
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}



import java.util.*;
class pattern2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printpattern2(n);
		}
		public static void printpattern2(int n){
		for(int row=1; row<=n;row++){
			for(int col=1; col<=row; col++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row=n-1; row>=1; row--){
			for(int col=1; col<=row; col++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
