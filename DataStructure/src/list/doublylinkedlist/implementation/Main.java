package list.doublylinkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList numbers = new DoublyLinkedList();
        System.out.println("----- [Doubly Linked List] ---------------------");
        numbers.addLast(10);
        numbers.addLast(15);
        numbers.addLast(20);
        numbers.addLast(30);

        System.out.println(numbers.remove(1));
        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.indexOf(30));

        DoublyLinkedList.ListIterator li = numbers.listIterator();

        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.next());

        li = numbers.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }

        li = numbers.listIterator();

        while(li.hasNext()){
            if((int)li.next() == 10)
                li.add(15);
        }
        System.out.println(numbers);

        li = numbers.listIterator();

        while(li.hasNext()){
            if((int)li.next() == 15)
                li.remove();
        }
        System.out.println(numbers);
    }
}
