package repository;



import org.springframework.data.jpa.repository.JpaRepository;

import entity.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

	StudentModel findByName(String name);
	

}
