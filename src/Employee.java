public class Employee {
    private String name;
    private int age;
    private String jobTitle;
  
    public Employee(String name, int age, String jobTitle) {
      this.name = name;
      this.age = age;
      this.jobTitle = jobTitle;
    }
  
    // getters and setters for name, age, and jobTitle
  
    public void displayEmployeeInfo() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Job Title: " + jobTitle);
    }
  }