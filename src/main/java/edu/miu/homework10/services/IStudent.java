package edu.miu.homework10.services;

import edu.miu.homework10.models.Student;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniel Tsegay Meresie
 */
public interface IStudent {
    List<Student> getAllStudents();
    void deleteStudent(Student student);
    Student getStudentById(Integer id);
    Student addStudent(Student student);
    void deleteStudentById(Integer id);
    
}
