package teacherServe;

import java.util.List;

public class TeacherView {
    public void showAllTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void showTeachers(Teacher teacher) {
        System.out.println(teacher);
    }
}
