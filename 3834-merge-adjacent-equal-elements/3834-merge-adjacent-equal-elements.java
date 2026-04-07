class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack = new Stack<>();

        for (int num : nums) {
            long curr = num;
            while (!stack.isEmpty() && stack.peek() == curr) {
                curr = stack.pop() * 2;
            }

            stack.push(curr);
        }

        return new ArrayList<>(stack);
    }
}