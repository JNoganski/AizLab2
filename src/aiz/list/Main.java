package aiz.list;


public class Main {


    public static void main(String[] args) {

        ListOne listOne = new ListOne();
        listOne.addLast(5);
        listOne.addLast("test dodaniana koniec listy");
        listOne.addLast("355");
        listOne.addFirst("test dodania na początku");
        listOne.print();


    }
}
