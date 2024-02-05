package sortirovkiAndTrie;

public class AVLTree {
    int key;
    int value;
    AVLTree left = null;
    AVLTree right = null;
    int heigth = 0;

    AVLTree(int key, int value) {
        this.key = key;
        this.value = value;
    }

    void updateHeigth(AVLTree node) {
        node.heigth = Math.max(getHeigth(node.left), getHeigth(node.right)) + 1;
    }

    int getHeigth(AVLTree node) {
        return (node == null) ? -1 : node.heigth;
    }

    int getBalanced(AVLTree node) {
        return (node == null) ? 0 : getHeigth(node.right) - getHeigth(node.left); // либо -2 значи балансируп вправо,значит влево больше высота // либо 2 , значит балансируем влево
    }

    void swap(AVLTree a, AVLTree b) {
        int a_key = a.key;
        a.key = b.key;
        b.key = a_key;
        int a_value = a.value;
        a.value = b.value;
        b.value = a_value;
    }

    void rightRotation(AVLTree node) {
        swap(node, node.left);
        AVLTree buffer = node.right;
        node.right = node.left;
        node.left = node.right.left;
        node.right.left = node.right.right;
        node.right.right = buffer;
        updateHeigth(node.right);
        updateHeigth(node);
    }

    void leftRotation(AVLTree node) {
        swap(node, node.right);
        AVLTree buffer = node.left;
        node.left = node.right;
        node.right = node.left.right;
        node.right.left = node.right.right;
        node.left.right = node.left.left;
        node.left.left = buffer;
        updateHeigth(node.left);
        updateHeigth(node);
    }

    void balanced(AVLTree node) {
        int balance = getBalanced(node);
        if (balance == -2) {
            if (getBalanced(node.left) == 1) leftRotation(node.left);
            rightRotation(node);
        } else if (balance == 2) {
            if (getBalanced(node.right) == -1) rightRotation(node.right);
            leftRotation(node);
        }
    }

    void inset(AVLTree node, int key, int value) {
        if (key < node.key) {
            if (node.left == null) {
                node.left = new AVLTree(key, value);
            } else inset(node.left, key, value);
        } else if (key >= node.key) {
            if (node.right == null) {
                node.right = new AVLTree(key, value);
            } else inset(node.right, key, value);
        }
        updateHeigth(node);
        balanced(node);
    }

    AVLTree delete(AVLTree node, int key) {
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
                AVLTree maxInLeft = getMax(node.left);
                node.key = maxInLeft.key;
                node.value = maxInLeft.value;
                node.right = delete(node.right, maxInLeft.key);
            }
        }
        if (node != null) {
            updateHeigth(node);
            balanced(node);
        }
        return node;
    }

    AVLTree getMax(AVLTree node) {
        if (node == null) {
            return null;
        }
        if (node.right == null) {
            return node;
        }
        return (getMax(node.right));
    }

    AVLTree getMin(AVLTree node) {
        if (node == null) {
            return null;
        }
        if (node.left == null) {
            return node;
        }
        return (getMin(node.left));
    }
}

