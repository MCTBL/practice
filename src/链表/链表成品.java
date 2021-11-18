package ����;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: ��־��  Zhang Zhihao
 * @Email: 3382885270@qq.com
 * @Date: 2020/5/3
 * @Time: 13:39
 * @Version: 1.0
 */
public class �����Ʒ {
    private Node head; //ͷ�ڵ�
    private Node last; //β�ڵ�
    private int size; //����ʵ�ʳ���

    public static void main(String[] args) {
        �����Ʒ myLinkedList = new �����Ʒ();
//        myLinkedList.remove(0); // java.lang.NullPointerException: ��ǰ����Ϊ�գ������Խ���ɾ������
//        myLinkedList.remove(3); // java.lang.IndexOutOfBoundsException: ��������ڵ㷶Χ
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
     * �������Ԫ��
     *
     * @param index ����λ��
     * @param data  ����Ԫ�� �����������ڵ������
     */
    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("��������ڵ㷶Χ��");
        }
        Node insertedNode = new Node(data);
        if (size == 0) {
            //������
            head = insertedNode;
            last = insertedNode;
        } else if (index == 0) {
            //����ͷ��
            insertedNode.next = head;
            head = insertedNode;
        } else if (size == index) {
            //����β��
            last.next = insertedNode;
            last = insertedNode;
        } else {
            //�����м�
            Node prvNode = get(index - 1);
            insertedNode.next = prvNode.next;
            prvNode.next = insertedNode;
        }
        size++;
    }

    /**
     * ����ɾ��Ԫ��
     *
     * @param index ɾ����λ��
     * @return ��ɾ���Ľڵ�
     */
    public Node remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("��������ڵ㷶Χ");
        }
        Node removeNode;
        if (index == 0) {
            if (size == 0) {
                throw new NullPointerException("��ǰ����Ϊ�գ������Խ���ɾ������");
            }
            //ɾ��ͷ�ڵ�
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            //ɾ��β�ڵ�
            Node preNode = get(index - 1);
            removeNode = preNode.next;
            preNode.next = null;
            last = preNode;
        } else {
            //ɾ���м�ڵ�
            Node prevNode = get(index - 1);
            removeNode = prevNode.next;
            prevNode.next = prevNode.next.next;
        }
        size--;
        return removeNode;
    }

    /**
     * ���½ڵ� ���б���ָ��λ�õĽڵ��data�滻Ϊָ����data��
     *
     * @param index ��Ҫ���µĽڵ��λ��
     * @param data  ��data
     * @return ��data
     */
    public int set(int index, int data) {
        Node x = get(index);
        int oldVal = x.data;
        x.data = data;
        return oldVal;
    }

    /**
     * �������Ԫ��
     *
     * @param index ���ҵ�λ��
     * @return indexλ�õ�Node����
     */
    public Node get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("��������Ľڵ�ķ�Χ��");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * �������
     */
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /**
     * ����ڵ�
     */
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
