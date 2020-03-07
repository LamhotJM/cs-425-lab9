package edu.miu.cs.cs425.lab9.eregistrar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs.cs425.lab9.eregistrar.model.StudentRegistration;

@Repository
public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration,Long> {

}
