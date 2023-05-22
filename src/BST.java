import java.util.*;

// Binary Search Tree Class
public class BST<K extends Comparable<K>, V> implements Iterable<K> {
    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    // Node class representing a single node in the tree
    private class Node {
        private K key;
        private V value;
        private Node left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = right = null;
        }
    }

    // Insert a key-value pair into the tree
    public void put(K key, V value) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null.");

        root = put(root, key, value);
    }

    // Recursive helper method to insert a node into the tree
    private Node put(Node node, K key, V value) {
        if (node == null) {
            size++;
            return new Node(key, value);
        }

        int comparison = key.compareTo(node.key);
        if (comparison < 0)
            node.left = put(node.left, key, value);
        else if (comparison > 0)
            node.right = put(node.right, key, value);
        else
            node.value = value;

        return node;
    }

    // Retrieve the value associated with a given key from the tree
    public V get(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null.");

        return get(root, key);
    }

    // Recursive helper method to search for a node with the given key in the tree
    private V get(Node node, K key) {
        if (node == null)
            return null;

        int comparison = key.compareTo(node.key);
        if (comparison < 0)
            return get(node.left, key);
        else if (comparison > 0)
            return get(node.right, key);
        else
            return node.value;
    }

    // Delete a node with the given key from the tree
    public void delete(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null.");

        root = delete(root, key);
    }

    // Recursive helper method to delete a node with the given key from the tree
    private Node delete(Node node, K key) {
        if (node == null)
            return null;

        int comparison = key.compareTo(node.key);
        if (comparison < 0)
            node.left = delete(node.left, key);
        else if (comparison > 0)
            node.right = delete(node.right, key);
        else {
            if (node.left == null && node.right == null)
                return null;
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;

            Node successor = findSuccessor(node.right);
            node.key = successor.key;
            node.value = successor.value;
            node.right = delete(node.right, successor.key);
        }

        return node;
    }

    // Find the minimum key in the subtree rooted at the given node
    private Node findSuccessor(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Custom iterator to perform in-order traversal of the tree
    @Override
    public Iterator<K> iterator() {
        return new BSTIterator();
    }

    // Inner class representing the iterator
    private class BSTIterator implements Iterator<K> {
        private Node
