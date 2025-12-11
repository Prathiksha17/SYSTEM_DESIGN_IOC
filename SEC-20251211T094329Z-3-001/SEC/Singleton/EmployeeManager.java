class EmployeeManager {
    String name;
    int age;
    static EmployeeManager employeeManager1;
    private EmployeeManager(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static EmployeeManager createManager(String name,int age){
        
        if(employeeManager1 != null){
            return employeeManager1;
        }
       employeeManager1 = new EmployeeManager(name,age);
        return employeeManager1;
    }
}