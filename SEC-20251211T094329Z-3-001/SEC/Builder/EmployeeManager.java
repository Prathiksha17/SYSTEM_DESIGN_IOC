class EmployeeManager {
    String name;
    int age;
    int salary;
    int id;
    String mobile;
    String email_id;
    String department;
    String add;

    private EmployeeManager(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.salary = builder.salary;
        this.id = builder.id;
        this.mobile = builder.mobile;
        this.email_id = builder.email_id;
        this.department = builder.department;
        this.add = builder.add;
    }
    public static class Builder{
        private String name;
        private int age;
        private int salary;
        private int id;
        private String mobile;
        private String email_id;
        private String department;
        private String add;
        public Builder(){
            
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder add(String add){
            this.add = add;
            return this;
        }
        public Builder email_id(String email_id){
            this.email_id = email_id;
            return this;
        }
        public Builder mobile(String mobile){
            this.mobile = mobile;
            return this;
        }
        public Builder salary(int salary){
            this.salary = salary;
            return this;
        }
        public Builder department(String department){
            this.department = department;
            return this;
        }
        
        public EmployeeManager build(){
            return new EmployeeManager(this);
        }

    }

    public static Builder tarashree(){
        return new Builder();
    }
    
}