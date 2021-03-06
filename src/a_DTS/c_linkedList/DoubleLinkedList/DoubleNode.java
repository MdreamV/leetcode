package a_DTS.c_linkedList.DoubleLinkedList;

/**
 * @author smn
 * @Description:定义一个节点，每个对象就是一个节点
 * @date 2021/6/28 0028 21:49
 */
public class DoubleNode {
    public int no;

    public String name;

    public DoubleNode next;

    public DoubleNode pre;

    public DoubleNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
