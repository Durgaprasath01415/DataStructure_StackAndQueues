public class Queues<T> {
    LinkedList<Integer> LinkedList = new LinkedList<>();

    public void enqueue(INode newNode) {
        LinkedList.append(newNode);
    }

    public INode peek() {
        return LinkedList.head;
    }

    public INode<Integer> dequeue() {
        return LinkedList.pop();
    }
}