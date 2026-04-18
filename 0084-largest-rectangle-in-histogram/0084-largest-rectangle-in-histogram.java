class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> st = new Stack<>();
        
        //for left part for small value
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = -1;
            } else{
                left[i] = st.peek();
            }
            st.push(i);
        }

        //for right part to store smaller value
        st.clear();
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i] = n;
            } else{
                right[i] = st.peek();
            }
            st.push(i);
        }

        //calculating the area
        int area[] = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            area[i] = arr[i] * (right[i] - left[i] - 1);
            max = Math.max(max, area[i]);
        }
        return max;
    }
}