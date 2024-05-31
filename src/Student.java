public class Student {

    private String name;
    private String surname;
    private Faculty faculty;
    public Student(String name, String surname, Faculty faculty) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
    }

    // Getter ve setter metodlari burada olmalidir

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Field: " + faculty;
    }

}


