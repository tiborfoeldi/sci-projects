public class BT <T extends Comparable<T>> {
    Node<T> root;
    String s = "";

    private Node addRecurseive(Node<T> current, T value){
        if (current == null){
            return new Node<T>(value);
        }
        if (value.compareTo(current.value) < 0 ){
            current.left = addRecurseive(current.left, value);
        } else if (value.compareTo(current.value) > 0)  {
            current.right = addRecurseive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(T value){
        root = addRecurseive(root, value);
    }

    public String traverseInOrder(Node<T> node) {

        if (node != null) {
            traverseInOrder(node.left);
            s += node.value + "\n";
            traverseInOrder(node.right);

        }
        return s;
    }
}
