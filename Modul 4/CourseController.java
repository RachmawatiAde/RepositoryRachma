public class CourseController {
    private Course model;
    private CourseView view;

    public CourseController(Course model, CourseView view) {
        this.model = model;
        this.view = view;
    }

    // Mengatur nilai pada model
    public void setCourseId(String id) {
        model.setId(id);
    }

    public void setCourseName(String name) {
        model.setName(name);
    }

    public void setCourseCategory(String category) {
        model.setCategory(category);
    }

    // Mengambil nilai dari model
    public String getCourseId() {
        return model.getId();
    }

    public String getCourseName() {
        return model.getName();
    }

    public String getCourseCategory() {
        return model.getCategory();
    }

    // Memperbarui tampilan
    public void updateView() {
        view.printCourseDetails(model.getId(), model.getName(), model.getCategory());
    }
}
