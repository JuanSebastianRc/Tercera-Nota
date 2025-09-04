public class salaries {
    public String name;       
    private double salary;    
    protected String role;    

    public salaries(String name, double salary, String role){
        this.name = name;
        this.salary = salary;
        this.role = role;
}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

          public double getSalar() {
        return salar;
    }

    public setSalaries(double salar) {
        if (salar>0) {
            salary+= salar;
        }else{
            System.out.println("el monto es menor al esperado");
    }

}
