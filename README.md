Binary Search Tree (BST)
This project consists of three Java classes: Main, Iterator, and BST. The BST class implements a Binary Search Tree data structure, while the Main class provides an example usage of the BST class. The Iterator interface defines the operations for iterating over the elements of a collection.

Main.java
The Main class contains the main method that demonstrates the usage of the BST class. It performs the following operations:

Creates an instance of the BST class with key-value pairs.
Prints the size of the BST.
Iterates over the BST using an iterator and prints all key-value pairs.
Checks if the BST contains a specific value.
Deletes a key-value pair from the BST.
Iterates over the updated BST and prints all key-value pairs again.
Iterator.java
The Iterator interface defines the methods for iterating over a collection. It declares the following methods:

next(): Returns the next element in the iteration.
hasNext(): Returns true if there are more elements to iterate, false otherwise.
remove(): (Default method) Throws an UnsupportedOperationException to indicate that the remove operation is not supported.
BST.java
The BST class implements a Binary Search Tree data structure. It supports the following operations:

put(K key, V value): Inserts a key-value pair into the tree.
get(K key): Retrieves the value associated with a given key from the tree.
delete(K key): Deletes a node with the given key from the tree.
iterator(): Returns an iterator for performing an in-order traversal of the tree.
containsValue(V value): Checks if the tree contains a node with the specified value.
size(): Returns the number of nodes in the tree.
The BST class uses a private inner class Node to represent a single node in the tree. Each node contains a key, a value, and references to its left and right child nodes.

The BST class also implements the Iterable interface, allowing for the iteration over the keys of the tree using an enhanced for loop.

