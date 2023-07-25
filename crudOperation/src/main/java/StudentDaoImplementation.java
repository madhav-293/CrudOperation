import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImplementation implements StudentDao{

    Connection connection;
    public StudentDaoImplementation(){
        connection=ConnectionFactory.getConnection();
    }
    @Override
    public void addStudent(Student newStudent) throws SQLException {
        String insertQuery="insert into gstudent (name,email) values (?,?)";//We did it to save our data from sql injection
        PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
        preparedStatement.setString(1,newStudent.getName());
        preparedStatement.setString(2,newStudent.getEmail());
        int c=preparedStatement.executeUpdate();
        if(c==1) System.out.println("Student record saved");
        else System.out.println("Ooops! Something went wrong.");

    }

    @Override
    public void updateStudent(Student updateStudent) {
        String updateQuery="u";

    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public List<Student> getStudent() {
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }
}
