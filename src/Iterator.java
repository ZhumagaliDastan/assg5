public interface Iterator<E> {
    E next();
    boolean hasNext();
    default void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported.");
    }
}
