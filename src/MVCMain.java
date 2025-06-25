class Student {
    private String name;
    private int rollNo;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

class StudentView {
    public void printStudentDetails(String name, int rollNo) {
        System.out.println("Student: " + name + ", Roll No: " + rollNo);
    }
}

class StudentController {
    private Student model;
    private StudentView view;
    
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
    
    public void setStudentName(String name) {
        model.setName(name);
    }
    
    public void setStudentRollNo(int rollNo) {
        model.setRollNo(rollNo);
    }
}

public class MVCMain {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("John");
        model.setRollNo(10);
        
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
        
        controller.setStudentName("Jane");
        controller.setStudentRollNo(20);
        controller.updateView();
    }
}