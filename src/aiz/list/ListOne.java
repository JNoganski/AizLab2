package aiz.list;

// Klasa ma być generyczną listą jednokierunkową
// wykorzystującą obiekty klasy ElemOne jako element listy.

public class ListOne implements IList {

    ElemOne first;
    ElemOne last;

    public void addFirst(Object newData) {
        ElemOne elemOne = new ElemOne(newData);
        elemOne.setData(newData);
        elemOne.setNext(null);
        elemOne.setNext(first);
        first = elemOne;
    }

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

    public void addAtPosition(Object newData, int position) throws ListException {
        ElemOne elemOne = new ElemOne(newData);
        if (position < 0 || position > size()) {
            throw new ListException("Podana wartość position " +
                    "jest mniejsza od 0 lub większa od rozmiaru listy");
        }
        elemOne.setNext(null);

        if (position == 0) {
            addFirst(newData);
        } else {
            ElemOne pointer = first;
            for (int i = 0; i < position-1; i++) {
                pointer = pointer.getNext();
            }
            elemOne.setNext(pointer.getNext());
            pointer.setNext(elemOne);
        }
    }
    @Override
    public int size() {
        if (first == null) {
            return 0;
        } else {
            ElemOne pointer = first;
            int i = 1; //liczenie trzeba zacząć od jednego
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
                i++;
            }
            return i;
        }
    }

    @Override
    public Object removeFirst() throws ListException {
        if (first == null) {
            throw new ListException("Lista jest pusta, nie można usunąć elementu");
        } else {
            first = first.getNext();
            return null;
        }
    }
    @Override
    public Object removeLast() throws ListException {
        if(first==null){
            throw new ListException("Lista jest pusta, nie można dodać elementu");
        }
        else{
            ElemOne drugaOstatnia = first;
                while(drugaOstatnia.getNext().getNext()!=null){
                drugaOstatnia = drugaOstatnia.getNext();
                }
                drugaOstatnia.getNext().setData(null);
                drugaOstatnia.setNext(null);
                last = drugaOstatnia;
            }
        return null;
    }

    @Override
    public Object remove(int position) throws ListException {
        if(position==0){
            first=first.getNext();
        }else{
            ElemOne pointer = first;
            ElemOne pointer2 = null;
            for(int i=0;i<position-1;i++){
                pointer= pointer.getNext();
            }
            pointer2 =pointer.getNext();
            pointer.setNext(pointer2.getNext());
            pointer2=null;
        }

        return null;
    }

    @Override
    public int find(Object dataToFind) {
        ElemOne pointer = first;
        int position = 0;
        while(pointer.getNext()!=null){
            if (pointer.getData()==dataToFind){
                return position;
            }else {
                position++;
                pointer = pointer.getNext();
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object data) {
        ElemOne pointer = first;
        for(int i=0;i<size();i++) {
            if (pointer.getData() == data) {
                return true;
            } else {
                pointer = pointer.getNext();
            }
        }return false;
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
