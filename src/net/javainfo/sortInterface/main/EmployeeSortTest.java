package net.javainfo.sortInterface.main;

import net.javainfo.sortInterface.domain.Employee;
import net.javainfo.sortInterface.domain.Manager;

import java.util.Arrays;

//testowanie sortowania pracowników i kierowników względem ich pensji od najmniejszej do największej
//największy priorytet mają kierownicy, więc ich przy sortowaniu uwzględnia najpierw
public class EmployeeSortTest {

    public static void main(String[] args) {

        var staff = new Employee[4];


        staff[0] = new Employee("Henryk Kwiatek", 35000.0);
        staff[1] = new Manager("Karol Kowalski", 75000.0);
        staff[2] = new Employee("Tadeusz Nowak", 38000.0);
        staff[3] = new Manager("Maja Kowalska", 60000.0);

        //najpierw sortuje kierowników, a potem dopiero zwykłych pracownikóœ
        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("name= " + e.getName() + " salary= " + e.getSalary());
        }


    }
}
