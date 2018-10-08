public class Node <T extends Comparable<T>> {
    T value;
    Node<T> left;
    Node<T> right;


    Node(T value){
        this.value = value;
        right = null;
        left = null;
    }
}
