class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int mx = 0;
        for (int i = 0; i < nums.length; i++) {
            mx = Math.max(mx, nums[i]);
            arr.add(gcd(mx, nums[i]));
        }
        Collections.sort(arr);
        long sum = 0;
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            sum += gcd(arr.get(l), arr.get(r));
            l++;
            r--;
        }

        return sum;
    }
}