package com.unitedcoder.inheritancetutorial;

import java.util.List;

public class DoctorStudent extends GraduateStudent{

    private List<String> publications;

    public DoctorStudent(List<String> publications) {
        this.publications = publications;
    }

    public DoctorStudent(String advisorName, String researchProject, List<String> publications) {
        super(advisorName, researchProject);
        this.publications = publications;
    }

    public DoctorStudent(long studentID, String firstName, String lastName, String className, int age, String major, String birthday, String advisorName, String researchProject, List<String> publications) {
        super(studentID, firstName, lastName, className, age, major, birthday, advisorName, researchProject);
        this.publications = publications;
    }


}
