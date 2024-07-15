package teacherServe;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    public void addTeacher(String name, String subject) {
        Teacher newTeacher = new Teacher(name, subject);
        teacherService.addTeacher(newTeacher);
    }

    public void editTeachers(int index, String newName, String newSubject) {
        teacherService.editTeachers(index, newName, newSubject);
    }

    public void showAllTeachers() {
        teacherView.showAllTeachers(teacherService.getAllTeachers());
    }
}
