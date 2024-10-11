package interfaces;

import models.Student;

import java.util.List;

public interface IStudent {
    public void save(Student student);
    public Student getStudent(Long id);
    public void update(Student student);
    public void delete(Student student);
    public List<Student> getStudents();
}
