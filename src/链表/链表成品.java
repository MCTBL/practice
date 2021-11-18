package 链表;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: 张志浩  Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/5/3
 * @Time: 13:39
 * @Version: 1.0
 */
public class 链表成品 {
    private Node head; //头节点
    private Node last; //尾节点
    private int size; //链表实际长度

    public static void main(String[] args) {
        链表成品 myLinkedList = new 链表成品();
//        myLinkedList.remove(0); // java.lang.NullPointerException: 当前链表为空，不可以进行删除操作
//        myLinkedList.remove(3); // java.lang.IndexOutOfBoundsException: 超出链表节点范围
        myLinkedList.insert(0, 3);
        myLinkedList.output();
        myLinkedList.insert(1, 7);
        myLinkedList.output();
        myLinkedList.insert(2, 9);
        myLinkedList.output();
        myLinkedList.insert(3, 5);
        myLinkedList.output();
        myLinkedList.insert(1, 6);
        myLinkedList.output();
        myLinkedList.remove(0);
        myLinkedList.output();
        myLinkedList.set(0, 23);
        myLinkedList.output();
    }

    /**
     * 链表插入元素
     *
     * @param index 插入位置
     * @param data  插入元素 被插入的链表节点的数据
     */
    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node insertedNode = new Node(data);
        if (size == 0) {
            //空链表
            head = insertedNode;
            last = insertedNode;
        } else if (index == 0) {
            //插入头部
            insertedNode.next = head;
            head = insertedNode;
        } else if (size == index) {
            //插入尾部
            last.next = insertedNode;
            last = insertedNode;
        } else {
            //插入中间
            Node prvNode = get(index - 1);
            insertedNode.next = prvNode.next;
            prvNode.next = insertedNode;
        }
        size++;
    }

    /**
     * 链表删除元素
     *
     * @param index 删除的位置
     * @return 被删除的节点
     */
    public Node remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node removeNode;
        if (index == 0) {
            if (size == 0) {
                throw new NullPointerException("当前链表为空，不可以进行删除操作");
            }
            //删除头节点
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            //删除尾节点
            Node preNode = get(index - 1);
            removeNode = preNode.next;
            preNode.next = null;
            last = preNode;
        } else {
            //删除中间节点
            Node prevNode = get(index - 1);
            removeNode = prevNode.next;
            prevNode.next = prevNode.next.next;
        }
        size--;
        return removeNode;
    }

    /**
     * 更新节点 将列表中指定位置的节点的data替换为指定的data。
     *
     * @param index 需要更新的节点的位置
     * @param data  新data
     * @return 旧data
     */
    public int set(int index, int data) {
        Node x = get(index);
        int oldVal = x.data;
        x.data = data;
        return oldVal;
    }

    /**
     * 链表查找元素
     *
     * @param index 查找的位置
     * @return index位置的Node对象
     */
    public Node get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表的节点的范围！");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 输出链表
     */
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /**
     * 链表节点
     */
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
