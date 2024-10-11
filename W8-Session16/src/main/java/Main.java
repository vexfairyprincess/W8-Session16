import dao.CityDAO;
import dao.StudentDAO;
import models.City;
import models.Student;


import java.util.Scanner;

public class Main {
    private static CityDAO cityDao = new CityDAO();
    private static StudentDAO studentDao = new StudentDAO();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Student and City Management System");
        System.out.println("1. Add a student");
        System.out.println("2. Update a student");
        System.out.println("3. Delete a student");
        System.out.println("4. View all students");
        System.out.println("5. Add a city");
        System.out.println("6. Update a city");
        System.out.println("7. Delete a city");
        System.out.println("8. View all cities");
        System.out.println("9. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                updateStudent();
                break;
            case 3:
                deleteStudent();
                break;
            case 4:
                viewAllStudents();
                break;
            case 5:
                addCity();
                break;
            case 6:
                updateCity();
                break;
            case 7:
                deleteCity();
                break;
            case 8:
                viewAllCities();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }

        public static void addStudent() {
            System.out.println("Enter student name");
            String name = scanner.nextLine();
            System.out.println("Enter student age");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter student city id");
            Long cityId = scanner.nextLong();
            scanner.nextLine();

            City city = cityDao.getCity(cityId);
            if (city == null) {
                System.out.println("City not found");
                return;
            }

            Student student = new Student();
            studentDao.save(student);
        }

    }
}