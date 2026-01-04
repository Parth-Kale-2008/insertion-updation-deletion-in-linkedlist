class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
}
public class LL2{
    Node head;
    void insert(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next !=null){
            temp =  temp.next;
        }
        temp.next = newNode;
    }

    void update(String olddata,String newdata){
        Node temp = head;
        while(temp != null){
            if(temp.data.equals(olddata)){
                temp.data = newdata;
                return;
            }
            temp = temp.next;
        }
    }

    void delete(String data){
        Node temp = head;
        while(temp.next != null && !temp.next.data.equals(data)){
            temp = temp.next;
        }
        if(temp.next != null)
            return;
            temp.next = temp.next.next;
        
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

        LL2 cars = new LL2();

        cars.insert("BMW X5");
        cars.insert("Maserati");
        cars.insert("Porsche 911");
        cars.insert("Alto");

        cars.display();

        cars.update("Alto", "Ferrari");
        cars.display();

        cars.delete("Maserati");
        cars.display();
    }
}

