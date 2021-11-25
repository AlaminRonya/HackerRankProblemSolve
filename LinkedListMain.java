public class LinkedListMain {
    public static void main(String[] args) {
        Node root = null;
        Linked linked = new Linked();
        root = linked.insertLast(4,root);
        root = linked.insertLast(3,root);
        root = linked.insertLast(2,root);
        root = linked.insertFirst(1,root);
        root = linked.insertFirst(0,root);
        linked.printList(root);
        System.out.println("show() method called");
        root = linked.insertAtPosition(45,2,root);
        linked.show(root);
    }
}
class Node{
    protected int data;
    protected Node next;
}
class Linked{
    public Node insertFirst(int data, Node node){
        if (node==null){
            return getNewNode(data);
        }
        Node a = getNewNode(data);
        a.next = node;
        return a;
    }
    public Node insertLast(int data, Node node){
        if (node==null){
            return getNewNode(data);
        }else {
            node.next = insertLast(data , node.next);
        }
        return node;
    }
    public Node insertAtPosition(int i, int position, Node node) {
        if (position < 0) {
            System.out.println("Position can't be less than 1");
        }

        if (node == null && position > 1) {
            System.out.println("Position is greater than element exists");
            return null;
        }

        if (node == null && position == 1) {
            return getNewNode(i);
        }

        if (position == 1) {
            Node newNode = getNewNode(i);
            newNode.next = node;
            return newNode;
        }

        node.next = insertAtPosition(i, position - 1, node.next);
        return node;
    }

    private Node getNewNode(int data) {
        Node a = new Node();
        a.data = data;
        a.next = null;
        return  a;
    }
    public void printList(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.data);
        printList(node.next);
    }
    public  void show(Node node){
        if (node == null){
            return;
        }
        while (node != null){
            System.out.println(node.data);
            node = node.next;

        }
    }
}