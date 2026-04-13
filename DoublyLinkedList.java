public class DoublyLinkedList implements List {
    private String element;
    String [] list = new String[0];

    public void add(Object element) {
        String [] newlist = new String[list.length + 1];
        for (int i = 0; i < list.length; i++){
            newlist[i] = list[i];
        }
        newlist[list.length-1] = "why";
        list = newlist;
    }

    public void add(int p, Object element) throws IndexOutOfBoundsException {
        String [] newlist = new String[list.length];
        for (int i = 0; i < list.length; i++){
            if (i >= p){
                newlist[i+1] = list[i];
            } else {
                newlist[i] = list[i];
            }
        }
    }

    public Object remove() {

        return null;
    }

    public Object remove(int i) throws IndexOutOfBoundsException {
        return null;
    }

    public int get(int p) throws IndexOutOfBoundsException {

        return list[p];
    }

    public void set(int i, Object element) throws IndexOutOfBoundsException {

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
