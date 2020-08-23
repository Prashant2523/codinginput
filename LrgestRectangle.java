class Solution {
    public int largestRectangleArea(int[] heights) {
        
        if (heights.length == 0) {
            return 0;
        }
        
        if (heights.length == 1) {
            return heights[0];
        }
        
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        
        int top;
        int area;
        int maxArea = -1;
        
        int i = 0;
        
        while (i < n) {
            
            if (stack.empty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i++);
            } else {
                top = stack.pop();
                
                if (stack.isEmpty()) {
                    area = heights[top] * i;
                } else {
                    area = heights[top] * (i - stack.peek() - 1);
                }
                
                maxArea = Math.max(maxArea, area);
            }
        }
        
        while (!stack.isEmpty()) {
            
            top = stack.pop();
                
            if (stack.isEmpty()) {
                area = heights[top] * i;
            } else {
                area = heights[top] * (i - stack.peek() - 1);
            }
                
            maxArea = Math.max(maxArea, area);            
        }
        
        
        return maxArea;
    }
}
