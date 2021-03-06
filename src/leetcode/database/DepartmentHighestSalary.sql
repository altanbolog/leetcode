# 184. Department Highest Salary
select d.Name Department, b.name Employee, b.salary Salary
from Department d,
     (select e2.Name name, a.salary salary, a.id id
      from Employee e2,
           (select max(e1.Salary) salary, e1.DepartmentId id from Employee e1 group by e1.DepartmentId) a
      where e2.Salary = a.salary
        and e2.DepartmentId = a.id) b
where d.Id = b.id