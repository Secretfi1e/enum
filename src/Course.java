public class Course {
    private String name;
    private Student[] students;
    private int size;
    private static final int INITIAL_CAPACITY = 5;

    public Course(String name) {
        this.name = name;
        this.students = new Student[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void addStudent(Student student) {
        if (size == students.length) {
            increaseCapacity();
        }
        students[size++] = student;
    }

    private void increaseCapacity() {
        int newCapacity = students.length * 2;
        Student[] newArray = new Student[newCapacity];
        System.arraycopy(students, 0, newArray, 0, size);
        students = newArray;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(name).append("\n");
        sb.append("Students:\n");
        for (int i = 0; i < size; i++) {
            sb.append(i + 1).append(". ").append(students[i]).append("\n");
        }
        return sb.toString();
    }
}





