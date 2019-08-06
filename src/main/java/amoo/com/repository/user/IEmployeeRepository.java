package amoo.com.repository.user;

import amoo.com.domain.user.Employee;
import amoo.com.repository.IRepository;
import java.util.Set;

public interface IEmployeeRepository extends IRepository<Employee, String> {
       Set<Employee> getAll();
}
