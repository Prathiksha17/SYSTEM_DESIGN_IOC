class Main{
    public static void main(String args[]){
    
        EmployeeManager employeeManager1 = EmployeeManager.createManager("Deepika",23);
        EmployeeManager employeeManager2 = EmployeeManager.createManager("Ramesh", 24);
        EmployeeManager employeeManager3 = EmployeeManager.createManager("shiva",45);
        System.out.println(employeeManager1.name);
        System.out.println(employeeManager2.name);
        System.out.println(employeeManager3.name);

    }
}