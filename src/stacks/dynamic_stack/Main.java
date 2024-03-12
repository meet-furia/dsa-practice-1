package stacks.dynamic_stack;

import stacks.custom_stack.CustomStack;

public class Main {
    public static void main(String[] args) {
        CustomStack dynamicStack = new DynamicStack();
        dynamicStack.push(5);
        dynamicStack.push(10);
        dynamicStack.push(15);
        dynamicStack.push(20);
        dynamicStack.push(25);
        dynamicStack.push(30);
        dynamicStack.push(35);
        dynamicStack.push(40);
        dynamicStack.push(45);
        dynamicStack.push(50);
        dynamicStack.push(55);
        dynamicStack.push(60);

        dynamicStack.display();

        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();

        dynamicStack.display();

        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();

        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();

        dynamicStack.display();
    }

}
