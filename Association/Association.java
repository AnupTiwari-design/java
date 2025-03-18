package Association;

public class Association {
    
        public static void main(String[] args) {
            Library lib = new Library("Central");
            Student student = new Student("Raj");
    
            student.studiesIn(lib);
        }
    }

