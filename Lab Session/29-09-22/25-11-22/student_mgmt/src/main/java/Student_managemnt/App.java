package Student_managemnt;

import java.util.List;

import student_mgmt.entity.*;

import student_mgmt.dao.Student;



public class App {


	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(101);
		student.setCourse("B Tech");
		student.setRollNumber(21);
		student.setStudentName("Priya");
		 Student student2 = new Student();
		 student2.setId(102);
		 student2.setCourse("BCA");
		 student2.setRollNumber(22);
		 student2.setStudentName("Priyanka");
		
		CreateStudent studentDao = new CreateStudent();
        studentDao.saveStudent(student);
        studentDao.saveStudent(student2);
     
        studentDao.deleteStudnet(101);
        
     // Get all instructors
        List<Student> students = studentDao.getAllStudents();
        students.forEach(studentTemp -> System.out.println(studentTemp.getStudentName()));
		
	}

}
