package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(new Employee("abc", 1000));
		listEmployee.add(new Employee("gbc", 5000));
		listEmployee.add(new Employee("kbc", 9000));
		listEmployee.add(new Employee("bbc", 1000));
		
List<String> employeesName =  listEmployee.stream().filter(e ->e.getSalary()>=5000).
map(Employee::getName).collect(Collectors.toList());
employeesName.forEach(e->System.out.println(e));

	}

}
