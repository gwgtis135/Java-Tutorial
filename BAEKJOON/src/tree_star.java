
public class tree_star {
public static void main(String[] args) {
	
	printtree(3,1,5);
	printtree(5,2,3);
	printtree(6,3,2);
	printree2(6);


	

}



 static void printtree(int n, int k,int g) {
	 for(int i=k ;i<=n;i++) {
			for(int j=1;j<=n-i+g;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i-1)*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
 static void printree2(int l) {
	 
 	for(int i =1;i<=3;i++) {
 		for(int j =1;j<=l;j++) {
 			System.out.print(" ");
 		}
 		for(int j =1;j<=3;j++) {
 			System.out.print("*");
 		}
 		System.out.println();
 	}
	}
 }
	

