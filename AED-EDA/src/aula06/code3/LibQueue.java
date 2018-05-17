package aula06.code3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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

    String temp = "";

    while (!isEmpty(q)){

      String name = peek(q);

      if (!name.equals("A") && !name.equals("B") && !name.equals("X")){

        temp = remove(q);

      } else {

        if (name.equals("A")) {

          add(a, temp);
          remove(q);
        }

        if (name.equals("B")) {

          add(b, temp);
          remove(q);
        }

        if (name.equals("X")) {


          if( size(a) > size(b) ){
            add(b, temp);
          }

          if (size(a) < size(b)) {
            add(a, temp);

          }


          remove(q);
        }
      }

    }


  }

}
