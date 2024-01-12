package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;


public class Program2 {
    public static void main(String[] args) {

        DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: seller findById ===");
        Department department = DepartmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 4: Seller insert ===");
        Department newDepartment = new Department(null,"TESTE");
        DepartmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());


    }
}
