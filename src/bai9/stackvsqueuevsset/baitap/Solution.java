package bai9.stackvsqueuevsset.baitap;

public class Solution {

    // Cấu trúc của một nút
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
        // khởi tạo 2 đối tượng đầu và cuối hàng đợi
    }

    // tạo hàng đợi xoay vòng
    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
            q.front = temp;
        else
            q.rear.link = temp;
        q.rear = temp;
        q.rear.link = q.front;
    }

    // xóa phần tử khỏi hàng đợi xoay vòng
    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }
        // If this is the last node to be deleted
        int value; // Value to be dequeued
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else  // There are more than one nodes
        {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    // hiển thị hàng đợi
    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.print("Elements in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }

    /*  Driver of the program  */
    public static void main(String args[]) {
        // tạo 1 hàng đời khởi tạo 2 đối tượng trước vào sau giá trị ban đầu là null
        Queue q = new Queue();
        q.front = q.rear = null;

        // chèn các phần tử vào hàng đợi
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // hiển thị hàng đợi sau khi chèn
        displayQueue(q);

        // xóa các phần tử trong hàng đợi
        System.out.println("Deleted value = "+ deQueue(q));
        System.out.println("Deleted value = "+ deQueue(q));

        // hiển thị lại hàng đợi sau khi xóa
        displayQueue(q);
        // thêm 2 phần tử vào hàng đợi
        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);
        // hiển thị lại sau khi thêm
    }
}


