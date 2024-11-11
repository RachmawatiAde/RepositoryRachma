public class Course {
    private String courseName;
    private String courseId;
    private String courseCategory;

    public String getId() {
        //mengembalikan nilai id Course
        return courseId;
    }

    public void setId(String id) {
        //set id Course
        this.courseId = id;
    }


    public String getName() {
        //Mengembalikan Nama Course
        return courseName;
    }

    public void setName(String name) {
        //set Nama Course
        this.courseName = name;
    }

    public String getCategory() {
        //Mengembalikan kategori Course
        return courseCategory;
    }

    public void setCategory(String category) {
        //set Kategori Course
        this.courseCategory = category;
    }
}
