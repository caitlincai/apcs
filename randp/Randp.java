public class Randp {
    private int[] nums;
    private int numsLeft;
	
    public Randp(int n) {
        initNums(n);
    }
	
    private void initNums(int n) {
        for (int i = 0; i < n; i++) {
            nums[i] = n;
        }
    }
	
    public int nextInt() {
        numsLeft--;
        return nums[Math.random() * numsLeft];
    }
}
