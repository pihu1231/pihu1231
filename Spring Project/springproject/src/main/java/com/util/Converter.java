package com.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.model.Model;
import com.springentity.Student;



@Component
public class Converter {

	//convert StudentDTO to Entity(Student)
		public Student convertToEntity(Model studentDTO)
		{
			Student student = new Student();
			if(studentDTO!=null)
			{
				BeanUtils.copyProperties(studentDTO, student);
			}
			return student;
		}
}
