package pattern;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++) {
				if(j==1 ) {
					System.out.print(i);
			
				}
				else if(i==1) {
					System.out.print(j);
				}
				else if(j==5) {
					System.out.print(j-i+1);
				}
				else if(i==5) {
					System.out.print(i-j+1);
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
