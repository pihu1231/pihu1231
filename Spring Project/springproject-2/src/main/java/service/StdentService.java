package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.StudentModel;
import repository.StudentRepository;

@Service
public class StdentService {
@Autowired
	private StudentRepository repository;
public StudentModel saveStudentModel(StudentModel stuModel) {
	return repository.save(stuModel);
}
public List<StudentModel> saveStudentModels(List<StudentModel> stuModels) {
	return repository.saveAll(stuModels);
}
public List<StudentModel> getStudentModels(List<StudentModel> stuModels) {
	return repository.findAll();
}
public StudentModel getStudentModelById(int id) {
	return repository.findById(id).get();

}
public StudentModel getStudentModelByName(String name) {
	return repository.findByName(name);

}
public String deleteStudentModel(int id) {
	repository.deleteById(id);
	return "Student_name removed !" +id;
}
public StudentModel updateStudentModel(StudentModel stuModel) {
	StudentModel exiStudentModel = repository.findById(stuModel.getId()).get();
	exiStudentModel.setName(stuModel.getName());
	exiStudentModel.setId(stuModel.getId());
	exiStudentModel.setE_mail(stuModel.getE_mail());
	exiStudentModel.setRoll_no(stuModel.getRoll_no());
	return repository.save(exiStudentModel);
}



}
