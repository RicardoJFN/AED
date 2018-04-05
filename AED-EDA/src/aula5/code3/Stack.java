package aula5.code3;

class Stack<T extends Comparable<? super T>> {
  LinkedList<T> elements;

  public Stack() {
    elements = new LinkedList<T>();
  }
}
