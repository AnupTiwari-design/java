package memory_allocation;

public class stack_m {
    int a;//stored in Heap
    String s;//stored in heap
    stack_m(){//stored in stack
        System.out.println("hello");
    }

     public static void main(String[] args) {

        stack_m ob=new stack_m();//reference stored in stack and object is stored in heap
        int a = 10; //stored in stack memory
        int b = 20; //stored in Stack memory
        System.out.println("a: " + a + ", b: " + b);
    }
}

