/* 
Lab 5
Partners: Alec Rezelj and Kiley Hardcorn
Date: 02.25.2021
*/

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.name = "Arnold Spielberg";
    student1.gpa = 4.0;
    student1.major = "Electrical Engineering";

    student1.print();
    //The above replaces the orginal s.o.p.

    Student student2 = new Student();
    //Above is declaring the second student.

    student2.name = "Alec Rezelj";
    student2.gpa = 4.3;
    student2.major = "Accounting / Information Systems";
    //Above is setting second student's attributes.

    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();
    //Above is decalring and initalizing array.

    gpas.add(student1.gpa);
    gpas.add(student2.gpa);
    //Above is adding the GPAs to the array.

    double sum = 0;

    for (double num : gpas){
      sum+=num;
    }
    //Above is setting "sum" equal to the sum of each values in the array.

    System.out.println("The average GAP is " + sum / gpas.size());
    //Above is calculating and printing the average GPA.
  }
}