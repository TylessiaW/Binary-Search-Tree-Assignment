import org.w3c.dom.Node;

public class IntegerSet {

	private Node root;
    private int size;
 
    public IntegerSet() {
        root = null;
        size = 0;
    }

    public IntegerSet(int array[]) {
        root = null;
        size = 0;

        if (array != null) {
            for (int value : array) {
                add (value);
            }
        }
    }

    public int magnitude() {
        return size;
    }

    public void clear() {
        root = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(int newItem) {
        if (contains(newItem)) {
            return false;
        }

        root = add(root, newItem);
        size++;
        return true;
    }

    private Node add(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.data) {
            node.leftChild = add(node.leftChild, value);
        } else if (value > node.data) {
            node.rightChild = add(node.rightChild, value);
        }

        updateHeight(node);
        return balance(node);
    }

    public boolean remove(int itemToRemove) {
         if (!contains(itemToRemove)) {
            return false;
        }
        root = remove(root, itemToRemove);
        size--;
        return true;
    }

   if (value < node.data) {
            node.leftChild = remove(node.leftChild, value);
        } else if (value > node.data) {
            node.rightChild = remove(node.rightChild, value);
        } else {
            if (node.leftChild == null && node.rightChild == null) {
                return null;
            } else if (node.leftChild == null) {
                return node.rightChild;
            } else if (node.rightChild == null) {
                return node.leftChild;
            } else {
                Node successor = getMinNode(node.rightChild);
                node.data = successor.data;
                node.rightChild = remove(node.rightChild, successor.data);
            }
        }

        updateHeight(node);
        return balance(node);
    }

    public boolean contains(int itemToFind) {
        Node current = root;

        while(current != null) {
            if (itemToFind == current.data) {
                return true;
            } else if (itemToFind < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }

        return false;
    }

    public IntegerSet union (IntegerSet other) {
        IntegerSet result = new IntegerSet();
        addInOrder(this.root, result);

        if (other != null) {
            addInOrder(other.root, result);
        }

        return result;

        }

        intersectionHelper(this.root, other, result);
        return result;
    }

    private void intersectionHelper(Node node, IntegerSet other, IntegerSet result) {
        if (node == null) {
            return;
        }

        intersectionHelper(node.leftChild, other result);

        if (other.contains(node.data)) { result.add(node.data);
    }

    intersectionHelper(node.rightChild, other, result);
}

public IntegerSet difference(IntegerSet other) {
    IntegerSet result = new IntegerSet();

    if (other == null) {
        addInOrder(this.root, result);
        return result;
    }
    differenceHelper(this.root, other, result);
    return result;
}

private void differenceHelper(Node node, IntegerSet other, IntegerSet result) {
    if (node == null) {
        return;
    }

    differenceHelper(node.leftChild, other, result);

    if (!other.contains(node.data)) {
        result.add(node.data);
    }

    differenceHelper(node.rightChild, other, result);
}

public IntegerSet symmetricDifference(IntegerSet other) {
    IntegerSet result = new IntegerSet();

    if (other == null) {
        addInOrder(this.root, result);
        return result;
    }
    // Implementation for symmetric difference would go here
    return result;
}
\publick int getMin() {
    if (root == null) {
        throw new IllegalStateExecption("set is empty");
    }

    return getMinNode(root).data;
}

public int getMax() {
    if (root == null) {
        throw new IllegalStateExecption("set is empty");
    }

    Node current = root;
    while (current.rightChild != null) {
        current = current.rightChild;
    }

    return current.data;
}

public String toString() {
    StringBuilder sb = new Stringbuilder();
    sb.append("[");
    buildStringInOrder(root, sb);

    if (sob.length() > 1) {
        sb.setlength(sb.length() - 2);
    }

    sb.append("]);
    return sb.toString();
}

  private void addInOrder(Node node, IntegerSet set) {
        if (node == null) {
            return;
        }

        addInOrder(node.leftChild, set);
        set.add(node.data);
        addInOrder(node.rightChild, set);
    }

    private Node getMinNode(Node node) {
        Node current = node;

        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current;
    }

    private int height(Node node) {
        return node == null ? -1 : node.height;
    }

    private void updateHeight(Node node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.leftChild), height(node.rightChild));
        }
    }

    private int get BalanceFactor(Node node) {
        return node == null ? 0 : height (node.leftChild) - height(node,rightChild);
}

Private Node balance(Node node) {
    int balanceFactor = getBalanceFactor(node);

    if (balanceFactor > 1) {
        if (getBalanceFactor(node.leftChild) < 0) {
            node.leftChild = rotateLeft(node.leftChild);
        }
        return rotateRight(node);
}

if (balanceFactor < -1) {
    if (getBalanceFactor(node.rightChild0 > 0) {
    node.rightCHild = rotateRight(node.rightChild);
}
    return roateLeft(node);
}
    return node;
}

Private Node rotateRight(Node y) {
Node x = y.leftChild;
Node t2 = x.rightChild;

x.rightChild = y;
y.leftChild = t2;

updateHeight(y);
updateHeight(x);

return x;
}

private Node rotateLeft(Node x) {
Node y = x.rightChild;
Node t2 = y.leftChild;

y.leftChild = x;
x.rightChild = t2;

updateHeight(x);
updateHeight(y);

return y;
}

Private class Node {
private int data;
        private int height;
        private Node leftChild;
        private Node rightChild;

        private Node(int data) {
            this.data = data;
            this.height = 0;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
}






        

