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
        listOne.remove(2);
        listOne.print();
        System.out.println("Rozmiar listy wynosi: "+listOne.size());
        //test dodania na pozycji
        //Dodaj size by sprawdzić czy działa
        System.out.println("Dodaję string test na wskazanym adresie");
           listOne.addAtPosition("test", 2);
           listOne.print();
        System.out.println("Usuwam ostatni element");
        listOne.removeLast();
        listOne.print();
        System.out.println("Integer 5 znajduje się na pozycji: "+listOne.find(5));
    }
}
