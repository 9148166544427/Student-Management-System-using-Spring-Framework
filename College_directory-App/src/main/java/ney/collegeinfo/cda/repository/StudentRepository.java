package ney.collegeinfo.cda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ney.collegeinfo.cda.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{}
