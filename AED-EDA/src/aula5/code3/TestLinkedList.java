package aula5.code3;

public class TestLinkedList {
  public static void main(String args[]) {
   /*LinkedList<Integer> l = new LinkedList<Integer>();
    for(int i = 8 ; i > 0 ; i--)
      LibLinkedList.addFirst(l, new Integer(i));
    System.out.println("list size: " + LibLinkedList.size(l));
    System.out.println("List: " + LibLinkedList.toString(l));
    //LibLinkedList.add(l, new Integer(55), 5);
    LibLinkedList.add(l, 55, 5);
    LibLinkedList.add(l, new Integer(22), 9);  
    LibLinkedList.addLast(l, new Integer(33));  
    System.out.println("list size: " + LibLinkedList.size(l));
    System.out.println(LibLinkedList.toString(l));
    LibLinkedList.removeFirst(l); 
    LibLinkedList.remove(l, 3);
    System.out.println("indexOf(6): " + LibLinkedList.indexOf(l, 55));
    System.out.println("indexOf(6): " + LibLinkedList.indexOf(l, 6));
    System.out.println(LibLinkedList.toString(l));*/

    /*char[] teste = new char[]{'u', 'o', 'i', 'e', 'a'};
    LinkedList<Character> l2 = new LinkedList<>();
    for(int i = 0; i != teste.length; i++)
      LibLinkedList.addFirst(l2, new Character(teste[i]));

    System.out.println(LibLinkedList.toString(l2));*/
    int[] arr = new int[]{2,7,1,5,3,9,2};
    LinkedList<Integer> newL = new LinkedList<>();
    for (int i = 0; i != arr.length; i++)
    LibLinkedList.addFirst(newL, new Integer(arr[i]));
    LibLinkedList.filter(newL, 3,8);
  }
}
