public class Employee {
String name;
double salary;
int workHours;
int hireYear;

Employee(String name,double salary,int workHours,int hireYear){
this.name= name;
this.salary = salary;
this.workHours = workHours;
this.hireYear = hireYear;
}

double tax(){
if(salary < 1000){
return 0;
}else{
return (salary/100*3);
}
}
double bonus(){
if(workHours > 40){
return ((workHours - 40)*30);
}else return 0;
}
void raiseSalary(){
if(2021-hireYear < 10){
salary = salary+((salary - tax() + bonus())/100*5);
}else if(2021 - hireYear > 9 && 2021 - hireYear < 20){
salary = salary + ((salary - tax() + bonus())/100*10);
}else {
salary = salary + ((salary - tax() + bonus())/100*15);
}
}
public String toString(){
return (name + " " + salary + " "  + workHours + " "  + hireYear);
}

public static void main(String args[]) {

Employee calisan = new Employee("osman",1000,45,2000);
System.out.println("Calisan bilgileri = " + calisan.toString());

calisan.raiseSalary();
System.out.println("Hesaplanan maas = " + calisan.salary);



}
}