package aiz.list;

// Klasa ma być generyczną listą jednokierunkową
// wykorzystującą obiekty klasy ElemOne jako element listy.
public class ListOne implements IList {
    @Override
    public void addFirst(Object newData) {

    }

    @Override
    public void addLast(Object newData) {

    }

    @Override
    public void addAtPosition(Object newData, int position) throws ListException {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object removeFirst() throws ListException {
        return null;
    }

    @Override
    public Object removeLast() throws ListException {
        return null;
    }

    @Override
    public Object remove(int position) throws ListException {
        return null;
    }

    @Override
    public int find(Object dataToFind) {
        return 0;
    }

    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public void print() {

    }
}
