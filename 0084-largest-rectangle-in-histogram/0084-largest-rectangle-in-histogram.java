class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i=0;i<=heights.length;i++) {
            int currentHeight=(i==heights.length)?0:heights[i];
            while (!stack.isEmpty()&&currentHeight < heights[stack.peek()]) {
                int h=heights[stack.pop()];
                int w;
                if (stack.isEmpty()) {
                    w=i;
                } else {
                    w=i-stack.peek()-1;
                }
                int area=h*w;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        return maxArea;
    }
}