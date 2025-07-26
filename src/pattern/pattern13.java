	package pattern;
	import java.util.Scanner;

	public class pattern13{

		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
		int count;
	for(int i=0; i<=n;i++) {
		count =i;
	for(int j=0;j<=n;j++) {
		System.out.print(count+" ");
		count=count+n;
	}
	System.out.println();
	
	}


	}

}
