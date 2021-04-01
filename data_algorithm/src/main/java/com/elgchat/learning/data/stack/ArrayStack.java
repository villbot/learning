package com.elgchat.learning.data.stack;

/**
 * 数组模拟栈实现
 */
public class ArrayStack {

    int[] nums = new int[8];
    int count;

    /**
     * 入栈
     * @param num 值
     */
    public void push(int num) {
        nums[count] = num;
        count++;
    }

    /**
     * 出栈
     * @return int
     */
    public int pop() {
        int num = nums[count-1];
        nums[count-1] = 0;
        count--;
        return num;
    }

    @Override
    public String toString() {
        StringBuilder numStr = new StringBuilder();
        for (int num : nums) {
            if (num != 0) {
                numStr.append(num).append(",");
            }
        }


        return "Stack{" +
                "nums=" + numStr +
                ", count=" + count +
                '}';
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("入栈后"+stack.toString());

        for (int i = 0; i < 2; i++) {
            System.out.println(stack.pop());
        }

        System.out.println("出栈剩余"+stack.toString());
    }
}
