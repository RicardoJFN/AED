package aula06.code3;

public class LibLinkedList {

  public static <T extends Comparable<? super T>>
  Node<T> getFirst(LinkedList<T> l) {
    return l.first;
  }

  public static <T extends Comparable<? super T>>
  boolean empty(LinkedList<T> l) {
    return (l.size == 0);
  }

  public static <T extends Comparable<? super T>>
  int size(LinkedList<T> l) {
    return l.size;
  }

  public static <T extends Comparable<? super T>>
  String toString(LinkedList<T> l) {
    if (l.size == 0)
      return new String("[]");
    else {
      String  s = new String("[");
      Node<T> p = l.first;
      while (p.next != null) {
        s += p.value + ",";
        p = p.next;
      }
      s += p.value + "]";
      return s;
    }
  }

  public static <T extends Comparable<? super T>>
  int indexOf(LinkedList<T> l, T value) {
    int     index = 0;
    Node<T> p     = l.first;
    while (p != null) {
      T  currVal = p.value;
      // the following line is why
      // T: T extends Comparable<? super T>
      if (currVal.compareTo(value) == 0)
        break;
      p = p.next;
      index++;
    }
    return (p == null)? -1: index;
  }

  public static <T extends Comparable<? super T>>
  void addFirst(LinkedList<T> l, T value) {
    l.first = new Node<T>(value, l.first);
    l.size++;
  }

  public static <T extends Comparable<? super T>>
  void add(LinkedList<T> l, T value, int index) {
    if ( index < 0 || index > l.size )  // allow adding at the end: index = l.size
      throw new IndexOutOfBoundsException();
    if ( index == 0 )
      l.first = new Node<T>(value, l.first);
    else {
      Node<T> p = l.first;
      for( int i = 0 ; i < index - 1 ; i++)
        p = p.next;
      p.next = new Node<T>(value, p.next);
    }
    l.size++;
  }

  public static <T extends Comparable<? super T>>
  void addLast(LinkedList<T> l, T value) {
    if(l.size == 0)
      l.first = new Node<T>(value, l.first);
    else {
      Node<T> p = l.first;
      for( int i = 0 ; i < l.size - 1 ; i++)
        p = p.next;
      p.next = new Node<T>(value);
    }
    l.size++;
  }

  public static <T extends Comparable<? super T>>
  void removeFirst(LinkedList<T> l) {
    if (l.size == 0)
      throw new IndexOutOfBoundsException();
    l.first = l.first.next;
    l.size--;
  }

  public static <T extends Comparable<? super T>>
  void remove(LinkedList<T> l, int index) {
    if ( index < 0 || index > l.size - 1 )
      throw new IndexOutOfBoundsException();
    if (l.size == 0)
      throw new IndexOutOfBoundsException();
    if ( index == 0 )
      l.first = l.first.next;
    else {
      Node<T> p = l.first;
      for ( int i = 0; i < index - 1; i++ )
        p = p.next;
      p.next = p.next.next;
    }
    l.size--;
  }

  public static <T extends Comparable<? super T>>
  void removeLast(LinkedList<T> l) {
    if (l.size == 0)
      throw new IndexOutOfBoundsException();
    remove(l, l.size - 1);
  }

  public static <T extends Comparable<? super T>>
  T get(LinkedList<T> l, int index) {
    if (l.size == 0)
      throw new IndexOutOfBoundsException();
    if ( index < 0 || index > l.size - 1 )
      throw new IndexOutOfBoundsException();
    Node<T> p = l.first;
    for ( int i = 0; i < index ; i++ )
      p = p.next;
    return p.value;
  }


  public static <T extends Comparable<? super T>> void filter(LinkedList<T> l, T min, T max){
    T value;
    int compareMin = 0;
    int compareMax = 0;
    for (int i = 0; i != l.size; i++) {
      value = LibLinkedList.get(l, i);
      compareMin = value.compareTo(min);
      compareMax = value.compareTo(max);
      if (compareMin < 0 || compareMax > 0) {
        remove(l, i);
        i--;
      }
    }



    System.out.println(LibLinkedList.toString(l));
  }
  public static <T extends Comparable<? super T>> void filter2(LinkedList<T> l, T min, T max){
    T value;
    //T value2 = l.first.value;
    int compareMin = 0;
    int compareMax = 0;
    System.out.println(LibLinkedList.toString(l));
    for (int i = 0; i < l.size; i++) {
      System.out.println("1" + LibLinkedList.toString(l));
      value = LibLinkedList.get(l, i);
      System.out.println("2" + LibLinkedList.toString(l));
      compareMin = value.compareTo(min);
      System.out.println("3" + LibLinkedList.toString(l));
      compareMax = value.compareTo(max);
      System.out.println("4" + LibLinkedList.toString(l));
      if (compareMin < 0 || compareMax > 0) {
        System.out.println("4" + LibLinkedList.toString(l));
        remove(l, i);
        System.out.println("5" + LibLinkedList.toString(l));
        i--;
        System.out.println("6" + LibLinkedList.toString(l));
      }
      System.out.println(LibLinkedList.toString(l));
    }



    System.out.println(LibLinkedList.toString(l));
  }
}
