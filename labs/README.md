# Employee Management System - Lab Assignment

## Objective
Build an **Employee Management System** using core Java concepts, including:
- Inheritance
- Abstract Classes
- Interfaces
- Collections (`Set`, `Map`, `ArrayList`)
- Access Modifiers
- `static` and `final` Keywords
- Method Overloading and Overriding

## Scenario
You will implement an Employee Management System to manage employees in different departments. Employees will have common attributes but specific behaviors based on their roles. The system should store employees in collections and allow operations like adding, removing, and searching employees.

---

## Requirements

### 1. Abstract Class: `Employee`
Create an abstract class `Employee` with the following:

#### Fields:
- `int id` (final)
- `String name` (private)
- `double salary` (protected)

#### Methods:
- Constructor to initialize `id`, `name`, and `salary`.
- Abstract method: `calculateBonus()`.
- Getter and setter for `name` (demonstrate encapsulation).
- Override `toString()` to display employee details.

---

### 2. Subclasses: `Developer` and `Manager`
Create two subclasses:
- `Developer` (extends `Employee`): with the following fields:
    - `String` programmingLanguage
    - static ArrayList possibleLanguages: can only be java, python, JavaScript
- `Manager` (extends `Employee`)

#### Each subclass must:
- Implement the `calculateBonus()` method:
  - Bonus for `Developer`: 20% of salary.
  - Bonus for `Manager`: 30% of salary.
- Override the `toString()` method to include role-specific details.
- Implement a static method in the `Developer` class for adding an additonal programming language to the possible programming languages

---

### 3. Interface: `Department`
Create an interface `Department` with the following methods:
- `String getDepartmentName()`
- `void assignDepartment(String name)`

Both `Developer` and `Manager` must implement this interface.

---

### 4. Collections: `Set` for Employees
- Use a `Set<Employee>` to store employees (ensure no duplicates).
- Implement a method to display all employees.

---

### 5. Map: Department-Wise Employee Storage
- Use a `Map<String, List<Employee>>` to store employees by department name.

#### Implement the following methods:
- Add an employee to a department.
- Remove an employee from a department.
- Display all employees in a specific department.

---

### 6. Static and Final Keywords
- Add a `static` field `companyName` in the `Employee` class and initialize it as `"Tech Solutions"`.
- Create a `final` method in the `Employee` class: `public final String getCompanyName()`.
- Demonstrate the usage of both `static` and `final`.

---

### 7. Method Overloading and Overriding
#### Overloading:
- Overload the `addEmployee()` method in the main program:
  - Version 1: Accepts an `Employee` object.
  - Version 2: Accepts `id`, `name`, `salary`, and role to create and add the employee.

#### Overriding:
- Override `toString()` in `Employee` and its subclasses.

---

### 8.BONUS: User Interaction
Allow the user to perform the following:
1. Add a new employee (choose role and department interactively).
2. Remove an employee by `id`.
3. Display all employees.
4. Search for an employee by `id`.
5. Display employees of a specific department.
