package com.javaguru.lessons.lesson8;

class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.learn();

        System.out.println();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.writeCode();
        juniorDeveloper.learn();
        juniorDeveloper.useGoogle();

        System.out.println();

        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.learn();
        middleDeveloper.debug();
        middleDeveloper.useGoogle();
        middleDeveloper.writeCode();

        System.out.println();

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.solveProblem();
        seniorDeveloper.writeCode();
        seniorDeveloper.debug();
        seniorDeveloper.useGoogle();
        seniorDeveloper.learn();

        System.out.println();
        System.out.println("Students");

        Student student1 = new Student();
        Student student2 = new JuniorDeveloper();
        Student student3 = new MiddleDeveloper();
        Student student4 = new SeniorDeveloper();

        Student[] students = {student1, student2, student3, student4};
        for (Student st : students) {
            st.learn();
        }


    }
}
