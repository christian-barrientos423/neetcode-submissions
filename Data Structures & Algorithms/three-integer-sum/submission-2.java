class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] sorted = Arrays.stream(nums).sorted().toArray();
        ArrayList<List<Integer>> output = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c = nums.length - 1;
        while (a < nums.length-2) {
            if (a > 0 && sorted[a] == sorted[a - 1]) {
                a++;
                continue;
            }
            b = a + 1;
            int num1 = sorted[a];
            while (b < c) {
                int num2 = sorted[b];
                int num3 = sorted[c];
                int sum = num2 + num3;
                if (sum == - num1) {
                    //it's a match
                    List<Integer> list = new ArrayList<>();
                    list.add(num1);
                    list.add(num2);
                    list.add(num3);
                    output.add(list);
                    b++;
                    c--;
                    // SKIP DUPLICATE 'b'
                    while (b < c && sorted[b] == sorted[b - 1]) b++;
                    // SKIP DUPLICATE 'c'
                    while (b < c && sorted[c] == sorted[c + 1]) c--;
                } else if (sum < - num1) {
                    b++;

                } else {
                    c--;
                }
            }
            a++;
            b = a+1;
            c = nums.length - 1;
        }

        return output;
    }
}
