public class ITemployee extends Employee {
    private String technology;
  
    public ITemployee(String name, int age, String jobTitle, String technology) {
      super(name, age, jobTitle);
      this.technology = technology;
    }
  
    // getter and setter for technology
  
    public void displayEmployeeInfo() {
      super.displayEmployeeInfo();
      System.out.println("Technology: " + technology);
    }
  }