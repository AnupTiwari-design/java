package memory_allocation;
    class Person {
        String name;  // Stored in heap
        int age;      // Stored in heap
    
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    
    public class HeapMemoryExample {
        public static void main(String[] args) {
            Person p1 = new Person("Alice", 25);
            Person p2 = new Person("Bob", 30);   
    
            System.out.println("Person 1: " + p1.name);
            System.out.println("Person 2: " + p2.name);
        }
    }

