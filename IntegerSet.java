public class IntegerSet {

	private Node root;
    private int size;
    
    public IntegerSet() {
    	//Empty set
    }
    
    public IntegerSet(int array[]) {
    	//Add elements of array to Binary Search Tree
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
        return false;
    }
    
    public boolean remove(int itemToRemove) {
    	return false;
    }

    public boolean contains(int itemToFind) {
        return false;
    }

    public IntegerSet union(IntegerSet other) {
        return null;
    }

    public IntegerSet intersection(IntegerSet other) {
        return null;
    }
    
    public IntegerSet difference(IntegerSet other) {
    	return null;
    }
    
    public IntegerSet symmetricDifference(IntegerSet other) {
    	return null;
    }
    
    public int getMin() {
    	return Integer.MIN_VALUE;
    }
    
    public int getMax() {
    	return Integer.MAX_VALUE;
    }

    public String toString() {
        return null;
    }
    
    //You may add any methods or constructors
    //to this class that you see fit.
    private class Node {
    	private int data;
    	private Node leftChild;
    	private Node rightChild;
    }
}