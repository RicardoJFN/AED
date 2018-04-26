package aula06.code3;

public class LibStack {
  public static <T extends Comparable<? super T>>
  boolean isEmpty(Stack<T> s) {
    return LibLinkedList.empty(s.elements);
  }
  public static <T extends Comparable<? super T>>
  int size(Stack<T> s) {
    return LibLinkedList.size(s.elements);
  }
  public static <T extends Comparable<? super T>>
  T pop(Stack<T> s) {
    T value = LibLinkedList.get(s.elements, 0);
    LibLinkedList.removeFirst(s.elements);
    //LibLinkedList.removeLast(s.elements);
    return value;
  }
  public static <T extends Comparable<? super T>>
      void push(Stack<T> s, T value) {
    LibLinkedList.addFirst(s.elements, value);
    //LibLinkedList.addLast(s.elements, value);
  } 
  public static <T extends Comparable<? super T>>
  T top(Stack<T> s) {
    return LibLinkedList.get(s.elements, 0);
  }
  public static <T extends Comparable<? super T>>
  String toString(Stack<T> s) {
    return LibLinkedList.toString(s.elements);
  }

  public static void reverse(Stack<Integer> s, int n){

    int[] newArr = new int[n];
    for (int i = 0; i <= n - 1; i++)
      newArr[i] = LibStack.pop(s);

    for (int i = 0; i != n; i++)
      LibStack.push(s,newArr[i]);

  }


  public static boolean balanced(String s) {


    Stack<Character> newStack = new Stack<>();
    for (int i = 0; i != s.length() - 1; i++){
      if ((int)s.charAt(i) == 40 || (int)s.charAt(i) == 91){
        LibStack.push(newStack, s.charAt(i));
      }
    }
  //fazer o ivnerso
    String t = "";
    for (int i = 0; i != s.length(); i++){

      if ((int)s.charAt(i) == 41 || (int)s.charAt(i) == 93){
        char value = LibStack.pop(newStack);
        int n  = (int)value;
        if ((int)s.charAt(i) == 41 && n == 40 || (int)s.charAt(i) == 93 && n == 91) {
          t += n;
        }else{
          return false;

        }
      }
    }



    return true;
  }


  public static int polaca(String s){

    int[] numeros = new int[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    int[] operadores = new int[]{42, 43, 44, 45};

    Stack<Integer> stackNumeros = new Stack<>();

    int x = 0;
    for (int i = 0; i != s.length(); i++){
      for (int j = 0; j != numeros.length; j++){
        for (int z = 0; z != operadores.length; z++){
          if ((int)s.charAt(i) == numeros[j]){
            LibStack.push(stackNumeros, (int)s.charAt(i));
          }else if ((int)s.charAt(i) == operadores[z]) {
             x = (int)s.charAt(i);
          }
          if (LibStack.size(stackNumeros) == 2) {


          }

          }
        }
      }


    System.out.println(LibStack.toString(stackNumeros));

    return 0;
  }


}
