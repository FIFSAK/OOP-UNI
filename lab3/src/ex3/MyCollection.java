package ex3;

public interface MyCollection<E> {
	void add(E element);          
    void remove(E element);
    void remove(int index);
    boolean contains(E element);
    void pushFront(E element);
    E getFront();
    E getBack();
    int size();     
    void clear();
    boolean isEmpty();
}
