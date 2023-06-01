package Algorithms;

public class Seminar3 {

    public static void main(String[] args) {

        // Двусвязный список
        TwoWayList<Integer> integerTwoWayList = new TwoWayList<>();
        integerTwoWayList.add(55);
        integerTwoWayList.add(26);
        integerTwoWayList.add(13);
        integerTwoWayList.add(98);
        
        System.out.println("Source TwoLinkedList:");
        integerTwoWayList.printList(integerTwoWayList);

        integerTwoWayList.revert();
        System.out.println("\nRevert TwoLinkedList:");
        integerTwoWayList.printList(integerTwoWayList);

        // Односвязный список
        OneWayList<Integer> integerOneWayList = new OneWayList<>();
        integerOneWayList.add(1);
        integerOneWayList.add(20);
        integerOneWayList.add(14);

        System.out.println("\nSource OneLinkedList:");
        integerOneWayList.printList(integerOneWayList);

        integerOneWayList.revertOne();
        System.out.println("Revert OneLinkedList:");
        integerOneWayList.printList(integerOneWayList);


    }

}
