package lab.lab4;

import lab.lab4.model.*;

public interface ComponentCreator {
    University createUniversity(String name);
    Faculty createFaculty(String name, Human dean);
    Department createDepartment(String name, Human head);
    Group createGroup(String name);
    Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group);
}