package LinkedList;

class Node {
    int d;
    Node n;

    public Node(int d) {
        this.d = d;
        this.n = null;
    }
}

public class BasicLinkedList {
    private Node h;

    public BasicLinkedList() {
        this.h = null;
    }

    public void add(int d) {
        Node newNode = new Node(d);
        if (h == null) {
            h = newNode;
        } else {
            Node t = h;
            while (t.n != null) {
                t = t.n;
            }
            t.n = newNode;
        }
    }

    public void delete() {
        if (h != null) {
            h = h.n;
        } else {
            System.out.println("List is empty.");
        }
    }

    public void display() {
        Node t = h;
        while (t != null) {
            System.out.print(t.d + " ");
            t = t.n;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BasicLinkedList l = new BasicLinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.print("List after adding nodes: ");
        l.display();

        l.delete();
        System.out.print("List after deleting a node: ");
        l.display();
    }
}
