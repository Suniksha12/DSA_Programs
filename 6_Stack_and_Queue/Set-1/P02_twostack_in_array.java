/*Implement Code in java in which we have to Implement two Stacks in an Array

Create a data structure twoStacks that represent two stacks. Implementation of twoStacks should use only one array, i.e., both stacks should use the same array for storing elements. 

Following functions must be supported by twoStacks.

push1(int x) –> pushes x to first stack 
push2(int x) –> pushes x to second stack
pop1() –> pops an element from first stack and return the popped element 
pop2() –> pops an element from second stack and return the popped element
Implementation of twoStack should be space efficient. 

Approach -1 Dividing the array into two halves.

Time Complexity : O(1)
Space Complexity : O(N)*/

/*
class TwoStacks{
    int[] arr;
    int size,top1,top2;
    TwoStacks(int n){
        size=n;
        arr=new int[n];
        top1 = n/2 + 1;
        top2 = n/2;
    }
    void push1(int x){
        if(top1>0){
            top1--;
            arr[top1] = x;
        }else { 
            System.out.println("Stack Overflow"
                             + " By element : " + x); 
            return; 
        } 
    }
    void push2(int x){
        if(top2<size-1){
            top2++;
            arr[top2]=x;
        }else { 
            System.out.println("Stack Overflow"
                             + " By element : " + x); 
            return; 
        } 
    }
    int pop1(){
        if(top1<=size/2){
            int x = arr[top1];
            top1++;
            return x;
        }else { 
            System.out.println("Stack Underflow"); 
            System.exit(1);
        }
        return 0; 
    }
    int pop2(){
        if(top2>=size/2+1){
            int x = arr[top2];
            top2--;
            return x;
        }
        else {
            System.out.print("Stack UnderFlow");
            System.exit(1);
        }
        return 1;
    }
}

public class P02_twostack_in_array {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        ts.push2(40);
        System.out.println("Popped element from stack1 is" + ":" + ts.pop1());
        System.out.println("Popped element from stack2 is"+":"+ts.pop2());
    }
}
*/

/*Approach 2- Starting from endpoints
 * 
 * Time Complexity : O(1)
 * Space Complexity : O(N)
 */

class P02_twostack_in_array{
    int size, top1,top2;
    int arr[];
    P02_twostack_in_array(int n){
        arr = new int[n];
        size=n;
        top1=-1;
        top2=size;
    }
    void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1] = x;
        }
        else {
            System.out.print("Stack Overflow");
            System.exit(1);
        }
    }
    void push2(int x){
        if(top1<top2-1){
            top2--;
            arr[top2] = x;
        }
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    int pop1(){
        if(top1 >=0){
            int x = arr[top1];
            top1--;
            return x;
        }
        else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2(){
        if(top2<size){
            int x = arr[top2];
            top2++;
            return x;
        }
        else {
            System.out.print("Stack underflow");
            System.exit(1);
        }
        return 0;
    }
    public static void main(String[] args) {
        P02_twostack_in_array ts = new P02_twostack_in_array(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" + " stack 1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack 2 is " + ts.pop2());
    }
}