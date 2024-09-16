
package com.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "grade", nullable = false)
    private int grade; // Grades will be on a scale of 1-5

    // add grade saving date
    @Column(name = "grade_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date gradeDate;

    public Exam() {}

    public Exam(Student student, int grade, Date gradeDate) {
        this.student = student;
        this.grade = grade;
        this.gradeDate = gradeDate;
    }

    public void setGradeDate(Date gradeDate) {
        this.gradeDate = gradeDate;
    }

    public Date getGradeDate() {
        return gradeDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
