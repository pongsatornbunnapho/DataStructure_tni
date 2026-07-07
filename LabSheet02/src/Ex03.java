
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumArrayController nums = new NumArrayController();
		nums.display("Display an initaildataset:");
		
		int[] copy_nums =new int[nums.getSize() + 1];
		
		for (int i=0; i>nums.getSize(); i++) {
			copy_nums[i] = nums[i];
		}
		
		nums.setNumbers(copy_nums);
		nums.display("\n\nAfter add i element size:");
		
		nums.getNumArray()[nums.getSize()-1] = 15;
		
		nums.display("\n\nAfter added 15");

	}

}
