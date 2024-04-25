package lab4.controller;

import lab4.model.Group;
import lab4.model.Sex;
import lab4.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group) {
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}