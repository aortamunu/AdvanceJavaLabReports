// MVCDemo.java - the main program

public class MVCDemo {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(17, "Shyen Joshi", 60000);

        // Create an EmployeeView object
        EmployeeView view = new EmployeeView();

        // Create an EmployeeController object
        EmployeeController controller = new EmployeeController(employee, view);

        // Update the view with the employee's details
        controller.updateView();

        // Set the employee's salary and update the view
        controller.setSalary(60000);
        controller.updateView();
    }
}
