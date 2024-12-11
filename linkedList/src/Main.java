//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
//        LL list = new LL();
//        list.insertFirst(7);
//        list.insertFirst(8);
//        list.insertFirst(15);
//        list.insertFirst(17);
//        list.insertLast(19);
//        list.insert(3,3);
//
//
////        list.deleteFirst();
//       // System.out.println(list.delete First());
//        list.display();
////        System.out.println(list.deleteLast());
////        list.deleteLast();
//        list.delete(3);
//        list.display();
//
//        DLL list = new DLL();
//        list.insertFirst(23);
//        list.insertFirst(14);
//        list.insertFirst(12);
//        list.insertFirst(13);
//        list.insertFirst(24);
//        list.insertLast(99);
//        list.insertAfter(12,29);
//        list.display();

        CLL list = new CLL();
        list.insertLast(12);
        list.insertLast(23);
        list.insertLast(14);
        list.insertLast(25);
        list.insertLast(29);
        list.display();
        list.delete(14);
        list.display();


    }
}