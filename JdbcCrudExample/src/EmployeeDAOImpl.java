import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//create table employee(id number(10),name varchar2(10),role varchar2(10)); #oracle
//create table employee(id int,name varchar(10),role varchar(10));   #mysql
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate; // template

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(Employee employee) {
		String query = "insert into employee(id,name,role) values(?,?,?)";

		Object[] args = new Object[] { employee.getId(), employee.getName(), employee.getRole() };

		int out = jdbcTemplate.update(query, args);
		if (out != 0) {
			System.out.println("Employee saved with id = " + employee.getId());
		} else
			System.out.println("Employee insertion failed with id=" + employee.getId());
	}

	@Override
	public void update(Employee employee) {
		String query = "update Employee set name=?, role=? where id=?";
		// JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { employee.getName(), employee.getRole(), employee.getId() };

		int out = jdbcTemplate.update(query, args);
		if (out != 0) {
			System.out.println("Employee updated with id=" + employee.getId());
		} else
			System.out.println("No Employee found with id=" + employee.getId());
	}

	@Override
	public void deleteById(int id) {
		String query = "delete from employee where id=?";
		int out = jdbcTemplate.update(query, id);
	}

	@Override
	public List<Employee> getAll() {
		List l = jdbcTemplate.query("select * from employee",new BeanPropertyRowMapper(Employee.class));

		return l;
	}

	@Override
	public Employee getById(int id)// 991
	{
		String sql = "select * from employee where id=?";
		Employee employee = (Employee) jdbcTemplate.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper(Employee.class));
		return employee;
		
	}

}
