import java.sql.SQLException;

public class App {
    public static void main(String args[]) throws SQLException {
        Student student=new Student();
//        student.setId(3);
        student.setName("Madhav3");
        student.setEmail("mad5havm774@gmail.com");
        StudentDao studentDao=StudentDaoFactory.getStudentDao();
        studentDao.addStudent(student);
//        studentDao.updateStudent(student);
//        student = studentDao.getStudentById(3);
//        System.out.println(student);
//        studentDao.deleteStudent(1);
//        Apache maven helps to manage
//        build,documentation ,reporting,SCM,release,distribution
    }
}
//JPA (JAva persistence api)