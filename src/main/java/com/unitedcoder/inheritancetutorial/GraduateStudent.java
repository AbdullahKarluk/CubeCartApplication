package com.unitedcoder.inheritancetutorial;

public class GraduateStudent extends Student{
    private String advisorName;
    private String researchProject;

    public GraduateStudent() {
    }

    public GraduateStudent(String advisorName, String researchProject) {
        this.advisorName = advisorName;
        this.researchProject = researchProject;
    }

    public GraduateStudent(long studentID, String firstName, String lastName,
                           String className, int age, String major, String birthday,
                           String advisorName, String researchProject) {
        super(studentID, firstName, lastName, className, age, major, birthday);
        this.advisorName = advisorName;
        this.researchProject = researchProject;
    }

    @Override
    public String toString() {
        return super.toString()+" "+advisorName+" "+researchProject+" ";
    }
}
