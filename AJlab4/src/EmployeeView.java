// EmployeeView.java - the View

import javax.swing.*;

public class EmployeeView {
    private JFrame frame;
    private JLabel idLabel;
    private JLabel nameLabel;
    private JLabel salaryLabel;

    public EmployeeView() {
        // Create the frame and labels
        frame = new JFrame("Employee View");
        idLabel = new JLabel("ID:");
        nameLabel = new JLabel("Name:");
        salaryLabel = new JLabel("Salary:");

        // Add the labels to the frame
        frame.add(idLabel);
        frame.add(nameLabel);
        frame.add(salaryLabel);

        // Set the layout of the frame
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Set the size of the frame and make it visible
        frame.setSize(200, 150);
        frame.setVisible(true);
    }

    public void showEmployeeDetails(Employee employee) {
        // Update the labels with the employee's details
        idLabel.setText("ID: " + employee.getId());
        nameLabel.setText("Name: " + employee.getName());
        salaryLabel.setText("Salary: " + employee.getSalary());
    }
}
