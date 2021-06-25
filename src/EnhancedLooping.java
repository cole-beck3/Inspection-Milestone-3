
public class EnhancedLooping {

	public static void main(String[] args) {
		double enhance[]= {3.1,5.6,7.7,8.2,10.2};
		double total=0;
		
		for(double x: enhance) {
			total+=x;
		}
				
		System.out.println("Enhanced Loop total is: " + total);
	}

}
