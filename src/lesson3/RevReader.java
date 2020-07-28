package lesson3;

public class RevReader<T> {

    private MyStack myStack;

    RevReader(MyStack myStack) {
        this.myStack = myStack;

        revRead();
    }

    public void revRead() {
        int s = myStack.size();
        for (int i = 0; i < s; i++) {
            System.out.print(myStack.pop() + " ");
        }
    }
}
