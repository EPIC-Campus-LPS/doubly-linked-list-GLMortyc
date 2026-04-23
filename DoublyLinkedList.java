public class DoublyLinkedList<E> implements List {
    private E value;
    private Node<E> head;
    private Node<E> last;
    Object [] list = new Object[0];

    public void add(Object element) {
        Node<E> a = new Node<E>(element);
        if (head == null) {
            head = last = Node<E> ;
        } else {
            Node<E> temp = last;
            last = (Node<E>) element;
            temp.setNextNode(last);
        }
    }

    public void add(int p, Object element) throws IndexOutOfBoundsException {
        Node<E> a = (Node<E>) element;


    }

    public Object remove() {
        Node<E> temp = last;

        return temp;
    }

    public Object remove(int i) throws IndexOutOfBoundsException {
        return null;
    }

    public Node<E> get(int p) throws IndexOutOfBoundsException {
        return (Node<E>) list[p];
    }

    public void set(int i, Object element) throws IndexOutOfBoundsException {
        list[i]= (Node<E>) element;
    }


    public int size() {
        return list.length;
    }


    public boolean isEmpty() {
        if (list.length == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return list.toString();
    }
}
