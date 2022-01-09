package collection;

import java.util.ArrayList;

public class GraphDemo {
    public static void main(String[] args) {

    }
}
class Graph<E>{
    class Node{
        private E obj;
        private ArrayList<Node> childs = new ArrayList<>();
        private boolean visited = false;

        public Node(E obj) {
            this.obj = obj;
        }
        public void addChild(Node childs){
            childs.addChild(childs);
        }
    }
}

