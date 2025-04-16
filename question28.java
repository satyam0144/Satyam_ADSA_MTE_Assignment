class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;
    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }
    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow in Stack1");
        }
    }
    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow in Stack2");
        }
    }
    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow in Stack1");
            return -1;
        }
    }
    public int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow in Stack2");
            return -1;
        }
    }
    public void printStacks() {
        System.out.print("Stack1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Stack2: ");
        for (int i = size - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);
        ts.push1(1);
        ts.push1(2);
        ts.push1(3);
        ts.push2(9);
        ts.push2(8);
        ts.push2(7);
        ts.printStacks();
        System.out.println("Popped from Stack1: " + ts.pop1());
        System.out.println("Popped from Stack2: " + ts.pop2());
        ts.printStacks();
    }
}