package Algorithms;

public class OneWayList<E> {

    private Node<E> head;

    public void add(E value) {
        Node<E> newNode = new Node<>();
        newNode.value = value;
        if (head != null) {
            newNode.nextNode = head;
        }
        head = newNode;
    }

    public int size() {
        Node<E> currentNode = head;
        int counter = 0;
        while (currentNode != null) {
            counter++;
            currentNode = currentNode.nextNode;
        }
        return counter;
    }

    public E get(int index) {
        Node<E> currentNode = head;
        int counter = 0;
        while (counter < index) {
            counter++;
            if (currentNode.nextNode == null) throw new ArrayIndexOutOfBoundsException();
            currentNode = currentNode.nextNode;
        }
        return currentNode.value;
    }

    public boolean contains(E value) {
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public int indexOf(E value) {
        int counter = 0;
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return counter;
            }
            counter++;
            currentNode = currentNode.nextNode;
        }
        return -1;
    }

    // add by index
    public void add(E value, int index) {
        if (index > size() || index < 0) throw new ArrayIndexOutOfBoundsException();
        if (index != 0) {
            Node<E> currentNode = head;
            while (index > 1) {

                index--;
                currentNode = currentNode.nextNode;
            }
            Node<E> newNode = new Node<>();
            newNode.value = value;
            currentNode.nextNode = newNode;
            Node<E> tmp = currentNode.nextNode;
            newNode.nextNode = tmp;
        } else add(value);
    }

    // разворот односвязного списка
    public void revertOne() {
        if (head != null && head.nextNode != null) {
            Node temp = head;
            revertOne(head.nextNode, head);
            temp.nextNode = null;
        }
    }

    private void revertOne(Node currentNode, Node previousNode) {
        if (currentNode.nextNode == null) {
            head = currentNode;
        } else {
            revertOne(currentNode.nextNode, currentNode);
        }
        currentNode.nextNode = previousNode;
        previousNode.nextNode = null;
    }

    public void printList(OneWayList list) {
        Node<E> currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.value + " ");

            // Go to next node
            currNode = currNode.nextNode;
        }

        System.out.println();
    }
    
}
