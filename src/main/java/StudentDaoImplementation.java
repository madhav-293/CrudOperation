import java.sql.*;
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
    public void updateStudent(Student updateStudent) throws SQLException {
        String updateQuery="update gstudent set name=?,email=? where id=?";
        PreparedStatement preparedStatement= connection.prepareStatement(updateQuery);
        preparedStatement.setString(1,updateStudent.getName());
        preparedStatement.setString(2,updateStudent.getEmail());
        preparedStatement.setInt(3,updateStudent.getId());
        int c=preparedStatement.executeUpdate();
        if(c==1) System.out.println("Data got Updated..");
        else System.out.println("No data to be updated..");
    }

    @Override
    public void deleteStudent(int id) throws SQLException {
//        String deleteQuery="delete from gstudent where id='"+id+"'";
        String deleteQuery="delete from gstudent where id=?";
        PreparedStatement preparedStatement= connection.prepareStatement(deleteQuery);
        preparedStatement.setInt(1,id);
        int c=preparedStatement.executeUpdate();
//        Statement statement= connection.createStatement();
//        int c=statement.executeUpdate(deleteQuery);
        if(c==1) System.out.println("Student data deleted.");
        else System.out.println("Provide a correct id..");
    }

    @Override
    public List<Student> getStudent() {

        return null;
    }

    @Override
    public Student getStudentById(int id) throws SQLException {
        String getStudent="select (name,email) from student where id=?";
        PreparedStatement preparedStatement= connection.prepareStatement(getStudent);
        preparedStatement.setInt(1,id);
        ResultSet rs=preparedStatement.executeQuery();
        Student student=new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setEmail(rs.getString(3));
        return student;
    }
}
