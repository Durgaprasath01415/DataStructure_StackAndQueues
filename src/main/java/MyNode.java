public class MyNode<E> implements INode<E> {
    private E data;
    private INode next;

    public MyNode(E data) {
        this.setData(data);
        this.setNext(null);
    }
    @Override
    public  E getData() {
        return data;
    }
    @Override
    public void setData(E data) {
        this.data = data;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}