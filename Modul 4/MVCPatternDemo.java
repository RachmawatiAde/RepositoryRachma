//demo
/**public class MVCPatternDemo {
    public static void main(String[] args) {
    Student model = retriveStudentFromDatabase();
    StudentView view = new StudentView();
    StudentController controller = new StudentController(model, view);
    controller.updateView();
    controller.setStudentName("John");
    controller.updateView();
    }
    private static Student retriveStudentFromDatabase(){
    Student student = new Student();
    student.setName("Robert");
    student.setRollNo("10");
    return student;
    }
    }**/

    //ini untuk bagian course

    public class MVCPatternDemo {
        public static void main(String[] args) {
            // Fetch course record based on the database (simulated here)
            Course model = retrieveCourseFromDatabase();
    
            // Create a view to display course details on the console
            CourseView view = new CourseView();
    
            // Create a controller with the model and view
            CourseController controller = new CourseController(model, view);
    
            // Display initial course details
            controller.updateView();
    
            // Update the course details
            controller.setCourseName("Python");
    
            // Display updated course details
            System.out.println("\nAfter updating, Course Details are as follows");
            controller.updateView();
        }
    
        // Simulated method to retrieve a course from a database
        private static Course retrieveCourseFromDatabase() {
            Course course = new Course();
            course.setName("Java");
            course.setId("01");
            course.setCategory("Programming");
            return course;
        }
    }
    