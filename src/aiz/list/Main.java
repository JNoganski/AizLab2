package aiz.list;


public class Main {


    public static void main(String[] args) throws ListException {

        ListOne listOne = new ListOne();
        listOne.addLast(5);
        listOne.addLast("6");
        listOne.addLast("7");
        listOne.addFirst("4");
        listOne.addFirst("3");
        listOne.print();
        System.out.println("Usunięto pierwszy element");
        listOne.removeFirst();
        listOne.print();
        System.out.println("usuwam z listy obiekt o wskazanym indeksie");
        listOne.remove(3);
        listOne.print();
        //test dodania na pozycji
        //Dodaj size by sprawdzić czy działa
          //  listOne.addAtPosition("test", 1);
    }
}
