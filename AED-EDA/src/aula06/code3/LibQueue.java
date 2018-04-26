package aula06.code3;

public class LibQueue {

  public static <T extends Comparable<? super T>>
  boolean isEmpty(Queue<T> q) {
    return LibLinkedList.empty(q.elements);
  }

  public static <T extends Comparable<? super T>>
  int size(Queue<T> q) {
    return LibLinkedList.size(q.elements);
  }

  public static <T extends Comparable<? super T>>
  void add(Queue<T> q, T value) {
    LibLinkedList.addLast(q.elements, value);
  }

  public static <T extends Comparable<? super T>>
  T peek(Queue<T> q) {
    return LibLinkedList.get(q.elements, 0);
  }

  public static <T extends Comparable<? super T>>
  T remove(Queue<T> q) {
    T value = LibLinkedList.get(q.elements, 0);
    LibLinkedList.removeFirst(q.elements);
    return value;
  }

  public static <T extends Comparable<? super T>>
  String toString(Queue<T> q) {
    return LibLinkedList.toString(q.elements);
  }


  public static void process(Queue<String> q, Queue<String> a, Queue<String> b){

      while (!isEmpty(q)){
        String name = remove(q);
        String x = peek(q);
        String stop = "";
      }
  }

}
