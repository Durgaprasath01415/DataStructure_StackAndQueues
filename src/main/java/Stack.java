public class Stack<E> {
        LinkedList<Integer> LinkedList = new LinkedList<>();

    public void push(INode newNode) {
        LinkedList.add(newNode);
    }

    public INode peek() {
        return LinkedList.head;
    }

    public INode pop() {
        return LinkedList.pop();
    }
}