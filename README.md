# Binary Search Tree (BST)

This project consists of three Java classes: `Main`, `Iterator`, and `BST`. The `BST` class implements a Binary Search Tree data structure, while the `Main` class provides an example usage of the `BST` class. The `Iterator` interface defines the operations for iterating over the elements of a collection.

## Main.java

The `Main` class contains the main method that demonstrates the usage of the `BST` class. It performs the following operations:

1. Creates an instance of the `BST` class with key-value pairs.
2. Prints the size of the BST.
3. Iterates over the BST using an iterator and prints all key-value pairs.
4. Checks if the BST contains a specific value.
5. Deletes a key-value pair from the BST.
6. Iterates over the updated BST and prints all key-value pairs again.

## Iterator.java

The `Iterator` interface defines the methods for iterating over a collection. It declares the following methods:

1. `next()`: Returns the next element in the iteration.
2. `hasNext()`: Returns `true` if there are more elements to iterate, `false` otherwise.
3. `remove()`: (Default method) Throws an `UnsupportedOperationException` to indicate that the remove operation is not supported.

## BST.java

The `BST` class implements a Binary Search Tree data structure. It supports the following operations:

1. `put(K key, V value)`: Inserts a key-value pair into the tree.
2. `get(K key)`: Retrieves the value associated with a given key from the tree.
3. `delete(K key)`: Deletes a node with the given key from the tree.
4. `iterator()`: Returns an iterator for performing an in-order traversal of the tree.
5. `containsValue(V value)`: Checks if the tree contains a node with the specified value.
6. `size()`: Returns the number of nodes in the tree.

The `BST` class uses a private inner class `Node` to represent a single node in the tree. Each node contains a key, a value, and references to its left and right child nodes.

The `BST` class also implements the `Iterable` interface, allowing for the iteration over the keys of the tree using an enhanced for loop.
