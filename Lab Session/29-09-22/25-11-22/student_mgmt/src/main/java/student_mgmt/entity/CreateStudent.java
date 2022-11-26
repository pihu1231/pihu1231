package student_mgmt.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import student_mgmt.dao.Student;
import student_mgmt.util.HibernateUtil;


public class CreateStudent {

 /**
  * @param args
  */
	

@SuppressWarnings("deprecation")
public void saveStudent(Student student) {
	Transaction transaction = null;
	try(Session session = HibernateUtil.getSessionFactory().openSession()){
		transaction = session.beginTransaction();
//		Save object
		session.save(student);
//		commit
		transaction.commit();}
		catch (Exception e) {
			if(transaction != null) {
			}
			transaction.rollback();
		}
	}
@SuppressWarnings("deprecation")
public Student getStudentById(long id) {
	Transaction transaction = null;
	Student student = null;
	try(Session session = HibernateUtil.getSessionFactory().openSession()){
		transaction = session.beginTransaction();
//		Save object
		student = session.load(Student.class, id);
//		commit
		transaction.commit();}
		catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			
		}
	return  student;
	
	}
@SuppressWarnings({ "unused", "deprecation", "unchecked" })
public List <Student> getAllStudents() {
	List<Student> students = null;
	Transaction transaction = null;
	Student student = null;
	try(Session session = HibernateUtil.getSessionFactory().openSession()){
		transaction = session.beginTransaction();
//		 get students
		students = session.createQuery("from Student").list();

		
//		commit
		transaction.commit();}
		catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			
		}
	return students;

	
	}
@SuppressWarnings("deprecation")
public void deleteStudnet(int id) {

	 

    Transaction transaction = null;
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        // start a transaction
        transaction = session.beginTransaction();



        // Delete a instructor object
        Student student = session.get(Student.class, id);
        if (student != null) {
            session.delete(student);
            System.out.println("student is deleted");
        }



        // commit transaction
        transaction.commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
}


}

