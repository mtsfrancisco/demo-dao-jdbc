package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department findById ===");
        Department department = DepartmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 2: Department insert ===");
        Department newDepartment = new Department(null,"TESTE");
        DepartmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        /*
        System.out.println("\n=== TEST 3: Department delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        DepartmentDao.deleteById(id);

         */

        System.out.println("\n=== TEST 4: Department update ===");
        department = DepartmentDao.findById(6);
        department.setName("TESTEMOD");
        DepartmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: Department findAll ===");
        List<Department> list = DepartmentDao.findAll();
        for ( Department obj : list) {
            System.out.println(obj);
        }




    }
}
