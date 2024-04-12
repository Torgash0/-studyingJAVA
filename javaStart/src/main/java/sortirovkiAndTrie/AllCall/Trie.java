package sortirovkiAndTrie.AllCall;

public class Trie {
    //двоичное дерево поиска
    static class Node {
        int key;
        int value;
        Node left = null;
        Node right = null;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        static void insert(Node node, int key, int value) {
            if (key < node.key) {
                if (node.left == null) {
                    node.left = new Node(key, value);
                } else {
                    insert(node.left, key, value);
                }
            }
            if (key >= node.key) {
                if (node.right == null) {
                    node.right = new Node(key, value);
                } else {
                    insert(node.right, key, value);
                }
            }
        }

        Node search(Node node, int key) {
            if (node == null) {
                return null;
            }
            if (node.key == key) {
                return node;
            }
            return (key < node.key) ? search(node.left, key) : search(node.right, key);
        }

        Node getMax(Node node) {
            if (node == null) {
                return null;
            }
            if (node.right == null) {
                return node;
            }
            return (getMax(node.right));
        }

        Node getMin(Node node) {
            if (node == null) {
                return null;
            }
            if (node.left == null) {
                return node;
            }
            return (getMin(node.left));
        }

        Node delete(Node node, int key) {
            if (node == null) {
                return null;
            } else if (key < node.key) {
                node.left = delete(node.left, key);
            } else if (key > node.key) {
                node.right = delete(node.right, key);
            } else {
                if (node.left == null || node.right == null) {
                    node = (node.left == null) ? node.right : node.left;
                } else {
                    Node maxInLeft = getMax(node.left);
                    node.key = maxInLeft.key;
                    node.value = maxInLeft.value;
                    node.right = delete(node.right, maxInLeft.key);
                }
            }
            return node;
        }

        void printTree(Node node) { // симметричный обход
            if (node == null) {
                return;
            }
            printTree(node.left);
            System.out.println(node.value);
            printTree(node.right);
        }

        void deleteTree(Node node) { // обратный обход
            if (node == null) {
                return;
            }
            deleteTree(node.left);
            deleteTree(node.right);
            System.out.println(node.value);
        }

        void copyTree(Node node) { //прямой обход
            if (node == null) {
                return;
            }
            copyTree(node.left);
            copyTree(node.right);
            System.out.println(node.value);
        }
    }
}


