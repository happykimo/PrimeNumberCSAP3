import java.util.ArrayList;

public class Testing {
	
	
	public static void main(String[]args) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		//Prime numbers
		for(int i=2;i<=1000000;i++) {
			for(int j=2;i<=i;j++) {
				if(j==i) {
					result.add(i);
				}
				if(i%j==0) {
					break;
				}
			}
		}
		display(result);
	}
	public static void display(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}