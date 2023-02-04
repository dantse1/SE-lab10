package edu.miu.homework10.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import lombok.*;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    @NotBlank(message = "studentNumber cannot be blank or empty or null")
    private String studentNumber;
    //@NotBlank(message = "First name cannot be blank or empty or null")
    private String firstName;
    private String middleName;
    private String lastName;
    private Double cgpa;
    private LocalDate enrollmentDate;
    private Boolean isInternational;
}
