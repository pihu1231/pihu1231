package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student_Data")
public class StudentModel {
@Id
@GeneratedValue
@Column(name ="Student_id")
private int id;
@Column(name = "Studnet_name")
private String name;
@Column(name = "Student_rollno")
private int roll_no;
@Column(name = "Student_email")
private String e_mail;
public StudentModel(int id, String name, int roll_no, String e_mail) {
	super();
	this.id = id;
	this.name = name;
	this.roll_no = roll_no;
	this.e_mail = e_mail;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getE_mail() {
	return e_mail;
}
public void setE_mail(String e_mail) {
	this.e_mail = e_mail;
}

}
