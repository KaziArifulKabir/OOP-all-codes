import java.util.Scanner;
class Person {
String name;
int age;
Person(String name, int age) {
this.name = name;
this.age = age;
}
void display() {
System.out.println("Name:" + name+", Age:" + age);
}
}

public class OOP_lab_work_4A {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of persons:");
int n = scanner.nextInt();
scanner.nextLine(); 
Person[] persons = new Person[n];

for (int i = 0; i<n; i++) {
System.out.print("Enter name of person " + (i+1) + ":");
String name = scanner.nextLine();

System.out.print("Enter age of person" + (i+1) + ":");
int age = scanner.nextInt();
scanner.nextLine();
persons[i] = new Person(name, age);
}
System.out.println("\nList of Persons:");
for (int i = 0; i<n; i++) {
persons[i].display();
}
scanner.close();
}
}