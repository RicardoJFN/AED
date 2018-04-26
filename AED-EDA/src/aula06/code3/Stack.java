package aula06.code3;

public class Stack<T extends Comparable<? super T>> {
  LinkedList<T> elements;

  public Stack() {
    elements = new LinkedList<T>();
  }
}
