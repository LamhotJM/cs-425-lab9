package edu.miu.cs.cs425.lab9.eregistrar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.lab9.eregistrar.model.StudentRegistration;
import edu.miu.cs.cs425.lab9.eregistrar.repository.StudentRegistrationRepository;
import edu.miu.cs.cs425.lab9.eregistrar.service.StudentRegistrationService;

@Service("studentRegistrationService")
public class StudentRegistrationServiceImpl implements StudentRegistrationService{

	@Autowired
	StudentRegistrationRepository studentRegistrationRepository;
	
	public StudentRegistrationServiceImpl() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public List<StudentRegistration> findAll() {
		// TODO Auto-generated method stub
		return studentRegistrationRepository.findAll();
	}

	@Override
	public StudentRegistration save(StudentRegistration studentRegistration) {
		// TODO Auto-generated method stub
		return studentRegistrationRepository.save(studentRegistration);
	}

	@Override
	public Optional<StudentRegistration> findOne(Long id) {
		// TODO Auto-generated method stub
		return studentRegistrationRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		studentRegistrationRepository.deleteById(id);
		
	}

}
