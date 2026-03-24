class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletion {

    Node head;
    void insert(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void delete(String data) {

        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.data.equals(data)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {

        Deletion cars = new Deletion();

        cars.insert("BMW X5");
        cars.insert("Maserati");
        cars.insert("Porsche 911");
        cars.insert("Alto");

        cars.delete("Maserati");
        cars.display();
    }
}
