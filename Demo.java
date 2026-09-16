public class Demo {
public static void main (String[] args){
Student s1 = new Student();
s1.id = 28;
s1.name = "Laraib";
s1.completedCredits = 4;
s1.printSummary();

Student s2 = new Student();
s2.id = 29;
s2.name = "Batool";
s2.completedCredits = 3;
s2.printSummary();
s2.addCredits(2);

Student a = new Student();
a.name = "Ali";
Student b = a;
b.name = "Sara";
Student c = new Student();
c.name = a.name;
a.printSummary();
b.printSummary();
c.printSummary();

}}