import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		
		System.out.println("Length = " + numlist.size());
		
		numlist.add(11);
		numlist.add(12);
		numlist.add(13);
		numlist.add(14);
		numlist.add(15);
		
		System.out.println("Length = " + numlist.size());
		System.out.println(numlist);
		
		System.out.println("\nEnter index to update: ");
		int index_update = scan.nextInt();
		System.out.println("Enter element to update: ");
		int index_update = scan.nextInt();
		
		System.out.print("\nEnter index to remove");
		int index_remove = scan.nextInt();
		
		numlist.remove(Integer.valueOf(element_remove));
		System.out.println(numlist);

	}

}
