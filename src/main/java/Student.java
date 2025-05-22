class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int studentNumber;

    public Student(String name, int age, int studentNumber){
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getStudentNumber(){
        return this.studentNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public String toString(){
        return "N:" + name + " A:" + age + " SN:" + this.studentNumber;
    }

    public int compareTo(Student you){
        return Integer.compare(this.studentNumber, you.studentNumber);
    }
}
