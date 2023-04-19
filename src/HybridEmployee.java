public class HybridEmployee extends Employee {
    private int salesCount;
    private double commissionRate;
    private int baseSalary;
  
    public HybridEmployee(String name, int age, String jobTitle, int salesCount, double commissionRate, int baseSalary) {
      super(name, age, jobTitle);
      this.salesCount = salesCount;
      this.commissionRate = commissionRate;
      this.baseSalary = baseSalary;
    }
  
    // getters and setters for salesCount, commissionRate, and baseSalary
  
    public double calculateCommission() {
      return salesCount * commissionRate;
    }
  
    public void displayEmployeeInfo() {
      super.displayEmployeeInfo();
      System.out.println("Sales Count: " + salesCount);
      System.out.println("Commission Rate: " + commissionRate);
      System.out.println("Commission: " + calculateCommission());
      System.out.println("Base Salary: " + baseSalary);
      System.out.println("Total Salary: " + (baseSalary + calculateCommission()));
    }
  }