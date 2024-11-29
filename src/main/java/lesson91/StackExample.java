package lesson91;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack.
        Stack<String> stack1 = new Stack<>();
        stack1.push("Vasia");
        stack1.push("kolia");
        stack1.push("Ania");
        stack1.push("Tania");
        System.out.println(stack1);
        System.out.println(stack1.peek());
        System.out.println(stack1.get(3));
        System.out.println(stack1.size()-1);

//        while (!stack1.isEmpty()){
//            System.out.println(stack1.pop());
//        }
        System.out.println(stack1);
    }
}
