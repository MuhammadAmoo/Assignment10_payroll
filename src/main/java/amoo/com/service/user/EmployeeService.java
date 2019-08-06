package amoo.com.service.user;

import amoo.com.repository.user.EmployeeRepository;
import amoo.com.repository.user.IEmployeeRepository;
import amoo.com.domain.user.Employee;

import java.util.Set;

public class EmployeeService implements IEmployeeService {

    private static EmployeeService service = null;
    private IEmployeeRepository repository;

    private EmployeeService(){this.repository = EmployeeRepository.getRepository();}

    public static EmployeeService getService(){
        if(service == null){service = new EmployeeService();}
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(String s) {
      this.repository.delete(s);
    }
}
