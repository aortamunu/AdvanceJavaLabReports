// EmployeeController.java - the Controller

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.showEmployeeDetails(model);
    }

    public void setSalary(double salary) {
        model.setSalary(salary);
    }
}
