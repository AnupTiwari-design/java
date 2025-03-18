package Association;
class Student {
String studentName;
    
    Student(String studentName) {
        this.studentName = studentName;
    }

    void studiesIn(Library library) {
        System.out.println(studentName + " studies in " + library.name + " Library.");
    }
}