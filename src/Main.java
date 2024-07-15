import teacherServe.TeacherController;

public class Main {
    public static void main(String[] args) {

        TeacherController controller = new TeacherController();

        // Adding teachers
        controller.addTeacher("Jhon Smith", "Math");
        controller.addTeacher("Julia Sky", "Physics");

        // Display of all teachers
        System.out.println("List of all the teachers:");
        controller.showAllTeachers();

        // Teacher Editing
        controller.editTeachers(0, "Egor Berg", "Algebra");

        // Show all teachers after editing
        System.out.println("\nList of all teachers after edit:");
        controller.showAllTeachers();
    }
}