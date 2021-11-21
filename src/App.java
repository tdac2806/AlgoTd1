import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Node<String> a = new Node<>("a");
        Node<String> b = a.setLeftChild(new Node<String>("b"));
        Node<String> d = a.setRightChild(new Node<String>("d"));

        Node<String> e = b.setLeftChild(new Node<String>("e"));
        Node<String> f = b.setRightChild(new Node<String>("f"));
        Node<String> g = d.setLeftChild(new Node<String>("g"));
        Node<String> i = d.setRightChild(new Node<String>("i"));

        Node<String> j = e.setLeftChild(new Node<String>("j"));
        Node<String> l = e.setRightChild(new Node<String>("l"));
        Node<String> m = g.setLeftChild(new Node<String>("m"));
        Node<String> n = i.setLeftChild(new Node<String>("n"));
        Node<String> o = i.setRightChild(new Node<String>("o"));

        Node<String> p = m.setLeftChild(new Node<String>("p"));

        Tree Tree = new Tree(a);
        printTree(a, ">");

    }

    private static <T> void printTree(Node<T> Node, String appender) {
        System.out.println(appender + Node.getData());
        if(Node.getLeftChild() != null) {
         printTree(Node.getLeftChild(), appender + appender);
        }

        if(Node.getRightChild() != null) {
         printTree(Node.getRightChild(), appender + appender);
        }
    }
}
