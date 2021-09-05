//public class Employee {
//    public String name;
//    private double salary;
//    public Employee(String empName)
//    {
//        name = empName;
//    }
//    public void setSalary(double empSal)
//    {
//        salary = empSal;
//    }
//    public void printEmp()
//    {
//        System.out.println("名字："+name);
//        System.out.println("薪水："+salary);
//    }
//
//    public static void main(String[] args) {
//        Employee empOne = new Employee("person1");
//        empOne.setSalary(10000.00);
//        empOne.printEmp();
//    }
//}

//        名字：person1
//        薪水：10000.0

public class Employee{
    private static double salary;//静态私有变量
    public static final String DEPARTMENT = "开发人员";//是一个常量

    public static void main(String[] args) {
        salary = 10000;
        System.out.println(DEPARTMENT+"平均工资："+salary);
    }
}

//开发人员平均工资：10000.0