import org.junit.Assert;
import org.junit.Test;

public class QueuesTest {
    @Test
    public void IfQueueIsCreatedShouldReturnTrue() {
        Queues<Integer> queue = new Queues<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        INode peek = queue.peek();
        Assert.assertEquals(peek, myFirstNode);
    }

    @Test
    public void InQueueIfNodeIsDequeuedShouldReturnTrue() {
        Queues<Integer> queue = new Queues<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        INode dequeueQueue = queue.dequeue();
        Assert.assertEquals(dequeueQueue, myFirstNode);
    }

}
