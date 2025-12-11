class Main{
    public static void main(String args[]){
    
        

        EmployeeManager abd = EmployeeManager.tarashree()
        .name("I am tarashree").age(43).id(345).add("SECE College").build();
        
        System.out.println(abd.name);
        System.out.println(abd.add);
        System.out.println(abd.age);
        System.out.println(abd.id);

    }
}
