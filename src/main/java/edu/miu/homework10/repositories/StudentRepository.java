package edu.miu.homework10.repositories;

import edu.miu.homework10.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
