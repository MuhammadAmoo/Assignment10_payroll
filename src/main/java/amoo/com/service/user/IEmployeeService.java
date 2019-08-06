package amoo.com.service.user;

import amoo.com.domain.user.Employee;
import amoo.com.service.IService;

import java.util.Set;

public interface IEmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
