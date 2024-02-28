package day26_statics.studenstTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {
    public String groupName;
    public int groupID;
    public ArrayList<Student> students; //it should be an arraylist ,because there can be more than
    // one students ,and we should be able to add and remove students
    /* when we create addstudent method which takes array of student we the loacal variable students and
    instance variable Arraylist have the same name ,so we use this keyword to assign th local variable array to the instance variable Arraylist

     */
    public StudentsGroup(String groupName, int groupID) {
        this.groupName = groupName;
        this.groupID = groupID;
        students = new ArrayList<>();
        // everytime a studenstsgroup object is created an arrayList object with
        // the size of zero is created
    }


    //takes one student object,and adds it to the arraylıst of students
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));

    }

    //takes name,id,age,gendr of student ,then create object
    public void addStudent(String name, int age, char gender, String id) {
        students.add(new Student(name,age,gender,id));
    }

    //takes the id and then removes the student object from Arraylist of student specified İD
    public void removeStudent(String id){
        students.removeIf(p-> p.id.equals(id));
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupID=" + groupID +
                ", number of students=" + students.size() +
                '}';
    }
}
