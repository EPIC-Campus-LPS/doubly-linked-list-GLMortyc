public class DoublyLinkedList<E> implements List {
    private Node<E> head;
    private Node<E> last;
    private int count = 0;
    
    public void add(Object e) {
        count += 1;
        Node<E> a = new Node(e);
        if (head == null) {
            head = last = a;
        } else {
            Node<E> temp = last;
            last = a;
            temp.setNextNode(last);
        }
    }

    public void add(int p, Object e) throws IndexOutOfBoundsException {
        count += 1;
        Node<E> a = new Node(e);
        Node<E> temp = last;
        last = a;
        temp.setNextNode(last);
    }

    public Object remove() {
        count -= 1;
        Node<E> temp = last;

        return temp;
    }

    public Object remove(int i) throws IndexOutOfBoundsException {
        count -= 1;
        Node<E> temp = last;
        temp.toString();
        return temp;
    }

    public Node<E> get(int p) throws IndexOutOfBoundsException {
        Node<E> g = new Node(p);
        g.toString();
        return g;

    }

    public void set(int i, Object e) throws IndexOutOfBoundsException {
        Node<E> a = new Node(e);
        last = a;
    }


    public int size() {
        return count;
    }


    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String output = head.toString() + ", ";
        for(int i = 1; i < count - 1; i++) {
            output += last.toString().toString() + ", ";
        }
        output += last.toString();
        return output;
    }
}
