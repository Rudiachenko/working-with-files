package task1.main;

import task1.dto.Employee;
import task1.dto.Person;
import task1.service.ObjectDeserializerService;
import task1.service.ObjectSerializerService;

public class App {
    private static final ObjectSerializerService objectSerializerService = new ObjectSerializerService();
    private static final ObjectDeserializerService objectDeserializerService = new ObjectDeserializerService();

    private static final String FILE_PATH_TO_PERSON = "src/main/resources/person.txt";
    private static final String FILE_PATH_TO_EMPLOYEE = "src/main/resources/employee.txt";

    public static void main(String[] args) {
        App app = new App();

        Person bob = app.createPersonToSerialize("Bob", "Alison", "Kudriashova-14b", 25);
        System.out.println(bob);

        objectSerializerService.serializeObject(bob, FILE_PATH_TO_PERSON);
        Person person = (Person) objectDeserializerService.deserializeObject(FILE_PATH_TO_PERSON);
        System.out.println(person);


        Employee employeeBob = app.createEmployeeToSerialize("Bob", "Alison", "Epam", "software engineer", 3);
        System.out.println(employeeBob);

        objectSerializerService.serializeObject(employeeBob, FILE_PATH_TO_EMPLOYEE);
        Employee employee = (Employee) objectDeserializerService.deserializeObject(FILE_PATH_TO_EMPLOYEE);
        System.out.println(employee);
    }

    private Person createPersonToSerialize(String name, String surname, String address, int age) {
        return new Person(name, surname, address, age);
    }

    private Employee createEmployeeToSerialize(String name, String surname, String company, String title, int experienceInYears) {
        return new Employee(name, surname, company, title, experienceInYears);
    }
}
