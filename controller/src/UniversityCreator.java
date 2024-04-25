package lab4.controller;

import lab4.ComponentCreator;
import lab4.model.*;
public class UniversityCreator {
    private ComponentCreator componentCreator;

    public UniversityCreator(ComponentCreator componentCreator) {
        this.componentCreator = componentCreator;
    }

    public University createTypicalUniversity(String name) {
        University university = (University) componentCreator.createUniversity(name);

        Faculty faculty1 = componentCreator.createFaculty("Environmental Economics and Management", new Human("Oleg", "Milchenko", "Artemovich", Sex.MALE));
        university.addFaculty(faculty1);
        Faculty faculty2 = componentCreator.createFaculty("Financially economical", new Human("Maria", "Bondarenko", "Mychailivna", Sex.FEMALE));
        university.addFaculty(faculty2);

        Department department1 = (Department) componentCreator.createDepartment("Law", new Human("Oleg", "Milchenko", "Artemovich", Sex.MALE));
        faculty1.addDepartment(department1);
        Department department2 = (Department) componentCreator.createDepartment("Marketing", new Human("Maria", "Bondarenko", "Mychailivna", Sex.FEMALE));
        faculty2.addDepartment(department2);

        Group group1 = new Group("081-17-1");
        Student student1 = (Student) componentCreator.createStudent("Oleg", "Milchenko", "Artemovich", Sex.MALE, group1);
        department1.addStudent(student1);

        Group group2 = new Group("075-17-2");
        Student student2 = (Student) componentCreator.createStudent("Maria", "Bondarenko", "Mychailivna", Sex.FEMALE, group2);
        department2.addStudent(student2);


        System.out.println("University: " + university.getName());
        System.out.println("\nFaculty: " + faculty1.getName());
        System.out.println("Department: " + department1.getName());
        System.out.println(student1.toString());

        System.out.println("\nFaculty: " + faculty2.getName());
        System.out.println("Department: " + department2.getName());
        System.out.println(student2.toString());

        return university;
    }
}