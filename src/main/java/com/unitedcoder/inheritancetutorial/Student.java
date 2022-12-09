package com.unitedcoder.inheritancetutorial;

public class Student {
    //properties
    private long studentID;
    private String firstName;
    private String lastName;
    private String className;
    private int age;
    private String major;
    private String birthday;

public Student(){

}

    public Student(long studentID, String firstName, String lastName, String className, int age, String major, String birthday) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.age = age;
        this.major = major;
        this.birthday = birthday;
    }

    public long getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getBirthday() {
        return birthday;
    }
    public String toString(){
    return studentID+", "+firstName+", "+lastName+", "+className+","+age+","+major
                +","+birthday;
    }


}