package com.jpa.demo.test;
 
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

 
@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestEmployeeDAO
{
    /* 
    @Autowired
    private EmployeeDAO employeeDAO;
     
    @Autowired
    private DepartmentDAO departmentDAO;
     
    @Test
    @Transactional
    @Rollback(true)
    public void testAddDepartment()
    {
        DepartmentEntity department = new DepartmentEntity("Information Technology");
        departmentDAO.addDepartment(department);
         
        List<DepartmentEntity> departments = departmentDAO.getAllDepartments();
        Assert.assertEquals(department.getName(), departments.get(0).getName());
    }
     
    @Test
    @Transactional
    @Rollback(true)
    public void testAddEmployee()
    {
        DepartmentEntity department = new DepartmentEntity("Human Resource");
        departmentDAO.addDepartment(department);
         
        EmployeeEntity employee = new EmployeeEntity();
        employee.setFirstName("Lokesh");
        employee.setLastName("Gupta");
        employee.setEmail("howtodoinjava@gmail.com");
        employee.setDepartment(department);
         
        employeeDAO.addEmployee(employee);
         
        List<DepartmentEntity> departments = departmentDAO.getAllDepartments();
        List<EmployeeEntity> employees = employeeDAO.getAllEmployees();
         
        Assert.assertEquals(1, departments.size());
        Assert.assertEquals(1, employees.size());
         
        Assert.assertEquals(department.getName(), departments.get(0).getName());
        Assert.assertEquals(employee.getEmail(), employees.get(0).getEmail());
    }*/
}