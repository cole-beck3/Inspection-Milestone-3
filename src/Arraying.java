//Cole Beck
public class Arraying {

	public static void main(String[] args) {
			int cobe[]=new int[3];
			
			cobe[0]=22;
			cobe[1]=165;
			cobe[2]=75;
			
			int sum=0;
			for(int counter=0;counter<cobe.length;counter++) {
				sum+=cobe[counter];
			}

			System.out.println("How old is Cole?: " + cobe[0]);
			System.out.println("How much does Cole weigh?: " + cobe[1] + " pounds");
			System.out.println("How tall is Cole?: " + cobe[2] + " inches");
			System.out.println("The sum of this array is " +sum);
	}
}