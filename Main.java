class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";

    System.out.println("student1's name is " + student1.getName() + " and their GPA is " + student1.getGPA() + " and their major is " + student1.getMajor());

// or can do this with the dot operator
    //System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major);
  }
}