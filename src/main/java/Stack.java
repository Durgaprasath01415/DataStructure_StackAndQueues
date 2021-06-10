public class Stack<E> {
    LinkedList<Integer> myLinkedList = new LinkedList<>();

    public void push(INode newNode) {
        myLinkedList.add(newNode);
    }

    public INode peek() {
        return myLinkedList.head;
    }
}