package teacherServe;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void editTeachers(int index, String newName, String newSubject) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher.setName(newName);
            teacher.setSubject(newSubject);
        }
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}
