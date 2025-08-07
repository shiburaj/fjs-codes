package com.example;

public class Task41 {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.dispStack();
        st.pop();
        st.dispStack();
    }
}

class Stack{
    int top;
    int[] stack;

    Stack(int size){
        this.stack = new int[size];
        this.top = -1;
    }

    void push(int a){
        if(top >= stack.length - 1){
            System.out.println("Stack Full!");
            return;
        }
        stack[++top] = a;
    }
    
    void pop(){
        if(top == -1){
            System.out.println("Stack Empty!");
            return;
        }
        top--;
    }
    
    void dispStack(){
        for(int i = top; i > -1; i--){
            System.out.printf(" | %d |%n", stack[i]);
        }
        System.out.println(' ');
    }
}
