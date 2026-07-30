class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                int peek=2*st.peek();
                st.push(peek);
            }
            else if(op.equals("+")){
                int a=st.peek();
                st.pop();
                int b=st.peek();
                st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else{
                int num=Integer.parseInt(op);
                st.push(num);
            }
        }
        while(!st.isEmpty()){
            sum+=st.peek();
            st.pop();
        }
         return sum;
        }
         
    }
