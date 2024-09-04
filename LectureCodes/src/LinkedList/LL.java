package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;

    }

    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
        }else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;

            size += 1;
        }

//        System.out.println(size);

    }

    public void insert(int val, int index){

        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;

    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head.next == null){
            tail = null;
        }

        size--;
        return val;
    }

public int deleteLast(){

        Node secondLast = get(size-2);

        int val = tail.val;
        tail = secondLast;
        tail.next = null;

        return val;
}


    public Node get(int index){
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public int deleteIndex(int index){
        if(index ==0){
            return deleteFirst();
        }

        if(index == size){
            return deleteLast();
        }

        Node prev = get(index-1);

        int val = prev.next.val;
        prev.next = prev.next.next;

        return val;

    }

    public Node find(int value){
        Node node = head;

        while(node != null){

            if(node.val == value){
                return node;
            }

            node = node.next;

        }

        return null;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next; /*My assumption:" temp = head.next " would work*/
        }
        System.out.println("End");
    }




    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val,Node next) {
            this.val = val;
            this.next = next;
        }
    }


}
