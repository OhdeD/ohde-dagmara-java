package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FacadeTestSuite {

    @Autowired
    Facade facade;

    @Test
    public void testFindByFirstThreeLettersOfCompanyName() {
        //Given

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        facade.getCompanyDao().save(softwareMachine);
        facade.getCompanyDao().save(dataMaesters);
        facade.getCompanyDao().save(greyMatter);

        String query = "%ter%";

        List<Company> thisCompany = facade.findCompanyByAnyString(query);

        //Then
        Assert.assertEquals(2, thisCompany.size());

        //CleanUp
        facade.getCompanyDao().deleteAll();
    }

    @Test
    public void testFindByLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Larcksony");

        facade.getEmployeeDao().save(johnSmith);
        facade.getEmployeeDao().save(stephanieClarckson);
        facade.getEmployeeDao().save(lindaKovalsky);
        //When
        String name = "%kson%";
        List<Employee> thisEmployee = facade.findEmployeeByAnyString(name);

        //Then
        Assert.assertEquals(2, thisEmployee.size());

        //CleanUp
        facade.getEmployeeDao().deleteAll();
    }

}
