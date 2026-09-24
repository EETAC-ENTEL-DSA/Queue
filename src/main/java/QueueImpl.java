import org.apache.log4j.Logger;

public class QueueImpl<E> implements Queue<E>{
    final static Logger logger = Logger.getLogger(QueueImpl.class);

    private E[] data;
    private int p;

    public QueueImpl(int len) {
        // TO-DO
        this.data = (E[])new Object[len];
        logger.info("nova cua de " + len+" elements");

    }

    public void push(E e) throws FullQueueException {
        // TO-DO
        logger.info("pre: 'push' nou element "+ e);
        if (isFull()) {
            logger.error("Cua plena");
            throw new FullQueueException();
        }

        this.data[this.p++]=e;
        logger.info("post: nou element "+ e);

    }


    public E pop() throws EmptyQueueException {
        // TO-DO
        logger.info("pre: 'pop' nou element ");
        return null;
    }

    private boolean isFull() {
        // TO-DO
        //return this.p == this.data.length;
        return false;
    }

    private boolean isEmpty() {
        // TO-DO
        return false;
    }

    public int size() {
        //TO-DO
        return this.p;
    }
}
