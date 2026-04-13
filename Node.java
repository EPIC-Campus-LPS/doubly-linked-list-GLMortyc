public class Node<E> {
    private E value;
    private Node<E> next;
    private Node<E> prev;

    public Node(E e) {
        value = e;
    }

    public Node(E e, Node<E> last) {
        value = e;
        prev = last;
    }

    public Node<E> setNextNode(Node<E> next) {
        return next;
    }

    public Node<E> setPrevNode(Node<E> prev) {
        return prev;
    }

    public Node<E> getPrevNode() {
        return prev;
    }

    public E getValue() {
        return value;
    }

    public boolean equals(Node<E> node) {
        if (prev == value) {
            return true;
        } else {
            return false;
        }
    }
}
