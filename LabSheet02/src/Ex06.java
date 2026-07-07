
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumArrayController nums = new NumArrayController();
		nums.display("Display an initail dataset:");
		
		int[] copy_nums = new int[nums.getSize() - 1];
		//copy_nums index 0-1 to copy_num index 0-1
		for (int i=0; i<2; i++) {
			copy_nums[i] = nums.getNumArray()[i];
		}
        //copy_nums index 3-6 to copy_num index 2-5
		for (int i=2+1; i<nums.getSize(); i++) {
			copy_nums[i-1] = nums.getNumArray()[i];
		}
		
		nums.setNumber(copy_nums);
		nums.display("\n\nafter deleted data in index 2:");
	}
}
