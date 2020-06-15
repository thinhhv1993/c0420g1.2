package bai8.danhsach.thuchanh;

//Tạo lớp MyLinkedList với các thuộc tính như mô tả.
public class MyLinkedList {
    private Node head;
    //head đối tượng lớp Node;
    private int numNodes;
    //numNodes size xác định số phần tử trong danh sách, mặc định gán là 0.

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    // Định nghĩa lớp lớp Node để chưa đối tượng trong list.
    private class Node {
        private Node next;
        private Object data;

        // thay đổi giá trị node
        public Node(Object data) {
            this.data = data;
        }

        //trả về giá trị của node hiện tại
        public Object getData() {
            return this.data;
        }
    }

    //Cài đặt phương thức add.
    //Mục đích: Thêm đối tượng vào vị trí thứ index trong danh sách.
    //Tham số đầu vào: vị trí thêm (index), đối tượng thêm (data).
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    //Cài đặt phương thức addFirst()
    //Mục đích: Thêm đối tượng vào vị trí đầu tiên trong danh sách
    //Tham số đầu vào: đối tượng thêm (data)
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    //Cài đặt phương thức get()
    //Mục đích: Lấy phần tử ở vị trí index từ danh sách
    //Tham số đầu vào: vị trí cần lấy (index)
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //Cài đặt phương thức printList
    //Mục đích: Hiển thị danh sách các phần tử trong danh sách
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //Tạo lớp TestMyLinkedList chứa hàm main
    //Tạo đối tượng thuộc lớp MyLinkedList.
    //Lần lượt gọi các phương thức addFist(), add(), printList() chạy ứng dụng quan sát kết quả.
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.printList();
    }
}
