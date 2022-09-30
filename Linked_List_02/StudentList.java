package Linked_List_02;

import java.util.LinkedList;

public class StudentList {
    public static void main(String[] args) {
        //Create Student LinkedList
        LinkedList<Student> list = new LinkedList<>();

        // Create Student Object
        Student stdn1 = new Student(101, "Rijon");
        Student stdn2 = new Student(102, "Mohosin");
        Student stdn3 = new Student(103, "Tahbila");
        Student stdn4 = new Student(104, "Muslema");
        Student stdn5 = new Student(105, "Momotaj");

        //Adding Student to the Student list
        list.add(stdn1);
        list.add(stdn2);
        list.add(stdn3);
        list.add(stdn4);
        list.add(stdn5);

        for(Student s : list){
            System.out.println("Id: "+s.id+"  Name: "+s.name+"  ClassName: "+Student.className);
        }

    }
}
