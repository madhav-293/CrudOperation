public class StudentDaoFactory {
    public static StudentDao studentDao=null;

    public static StudentDao getStudentDao(){
        if(studentDao==null){
            studentDao=new StudentDaoImplementation();
        }
        return studentDao;
    }
}

