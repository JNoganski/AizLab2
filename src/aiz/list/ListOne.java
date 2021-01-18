package aiz.list;

// Klasa ma być generyczną listą jednokierunkową
// wykorzystującą obiekty klasy ElemOne jako element listy.

public class ListOne implements IList {

    ElemOne first;
    ElemOne last;

    @Override
    public void addFirst(Object newData) {
        ElemOne elemOne = new ElemOne(newData);
        if(first == null){
            first = elemOne;
        }else {

        }
    }
    @Override
    public void addLast(Object newData) {
            ElemOne elemOne = new ElemOne(newData);
            elemOne.setNext(null);
            if(first == null){
                first = elemOne;
            }else {
            ElemOne pointer = first;
            while(pointer.getNext()!=null){
                pointer = pointer.getNext();
            }
            pointer.setNext(elemOne);
            last = elemOne;
            }


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
        ElemOne elemOne = first;
        while(elemOne.getNext()!=null){
            System.out.println(elemOne.getData());
            elemOne = elemOne.getNext();
        }
        System.out.println(elemOne.getData());
    }
}
