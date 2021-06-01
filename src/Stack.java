public class Stack {
   public static int [] stack;
   public static int top_of_stack = -1;
   public static int N=0;

   public static void createStack (int size){
       stack = new int [size];

   }
   public static int addElement (int e){
       if (N == stack.length){
           System.out.println("stack is full");
           return -1;
       }
       top_of_stack++;
       stack[top_of_stack] = e;
       N++;
       return top_of_stack;

    }
    public static int removeElement(){
       if(N==0){
           System.out.println("Stack is empty");
           return -1;
       }
       int e = stack[top_of_stack];
       stack[top_of_stack] =0;
       top_of_stack--;
       N--;
       return e;
    }
    public static void printTop(){
       if(N==0){
           System.out.println("Stack is empty");
           return;
       }
       int e =stack[top_of_stack];
        System.out.println(e);

    }
    public static void show_stack(){
       for(int i=N-1; i>=0; i--){
           System.out.println(stack[i]);
       }
    }

    public static void main(Test[] args) {
        createStack(5);
        addElement(6);
        addElement(7);
        addElement(9);
        addElement(3);
        addElement(2);
        removeElement();
        removeElement();
        show_stack();
        printTop();
    }

}
