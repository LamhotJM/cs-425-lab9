package edu.miu.cs.cs425.lab9.eregistrar.service;

import java.util.List;
import java.util.Optional;

import edu.miu.cs.cs425.lab9.eregistrar.model.StudentRegistration;

public interface StudentRegistrationService {
	List<StudentRegistration> findAll();
	StudentRegistration save(StudentRegistration studentRegistration);
	StudentRegistration findOne(Long id);
	void delete(Long id);

}
