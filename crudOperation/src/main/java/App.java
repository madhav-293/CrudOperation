import java.sql.SQLException;

public class App {
    public static void main() throws SQLException {
        Student student=new Student();
        student.setName("Madhav");
        student.setEmail("madhavm774@gmail.com");
        StudentDao studentDao=StudentDaoFactory.getStudentDao();
        studentDao.addStudent(student);
    }
}
