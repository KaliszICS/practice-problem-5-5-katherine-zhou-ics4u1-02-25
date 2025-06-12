
public class Student implements Comparable<Student>{
    public String name, studentnumber;
    public int age;

    public Student(String name, int age, String studentnumber){
        this.name=name;
        this.age=age;
        this.studentnumber=studentnumber;
    }

    public String getName(){
        return this.name;
    }

     public int getAge(){
        return this.age;
    }

     public String getStudentNumber(){
        return this.studentnumber;
    }

     public void setName(String name){
        this.name=name;
    }

      public void setAge(int age){
        this.age=age;
    }
      public void setStudentNumber(String studentnumber){
        this.studentnumber=studentnumber;
    }

    public int compareTo(Student student){
        return this.studentnumber.compareTo(student.getStudentNumber());
    }

    public String toString(){
        if(this.name==null||this.studentnumber==null){
            return null;
        }
        return "N:"+ this.name+ " A:"+this.age+ " SN:"+this.studentnumber;
    }
}
