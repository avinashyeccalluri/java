package LeetCode;

/**
 * StackImplementationinjava
 */
public class StackImplementationinjava {

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(-1);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }
    
}
class MinStack {

    /** initialize your data structure here. */
    int[] stack;int front;int end;int minValue=Integer.MAX_VALUE;
    public MinStack() {
        stack=new int[10];
        
    }    
    public void push(int x) {
        if(end==stack.length-1){
            int[] newArray=new int[2*stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack=newArray;
        }
        
        stack[end]=x;
        end++;
        
    }    
    public void pop() {
        
        int temp=stack[end--];
        int a=end;
        stack[end]=0;        
        
    }    
    public int top() {
        int a=end-1;
        return stack[a];
    }    
    public int getMin() {
        for(int i=0;i<end;i++){
            if(stack[i]<minValue){
                minValue=stack[i];
            }
        }int a= minValue;
        minValue=Integer.MAX_VALUE;
        return a;
        
    }
}