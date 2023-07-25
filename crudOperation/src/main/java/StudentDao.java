import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    void addStudent(Student newStudent) throws SQLException;
    void updateStudent(Student updateStudent);
    void deleteStudent(int id);
    List<Student> getStudent();
    Student getStudentById(int id);
}
