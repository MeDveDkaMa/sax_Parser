public class Administrator {
    String FirstName, LastName, ContactNo, Email, Department, Faculty, City, position;

//    public Administrator(String firstName, String lastName, String contactNo, String email, String department, String faculty, String city, String position) {
//        FirstName = firstName;
//        LastName = lastName;
//        ContactNo = contactNo;
//        Email = email;
//        Department = department;
//        Faculty = faculty;
//        City = city;
//        this.position = position;
//    }

    public Administrator(String firstName){
        FirstName = firstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public String getEmail() {
        return Email;
    }

    public String getDepartment() {
        return Department;
    }

    public String getFaculty() {
        return Faculty;
    }

    public String getCity() {
        return City;
    }

    public String getPosition() {
        return position;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
