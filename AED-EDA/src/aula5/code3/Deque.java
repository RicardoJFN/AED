package aula5.code3;

public class Deque<T extends Comparable<? super T>> {
  DoubleLinkedList<T> elements;

  public Deque() {
    elements = new DoubleLinkedList<T>();
  }
}
