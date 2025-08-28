class Student {
    private String name;
    private String group;
    private int course;
    private double[] grades;

    public Student(String name, String group, int course, double[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() { 
        return name; }
    public void setName(String name) { 
        this.name = name; }
    public String getGroup() { 
        return group; }
    public void setGroup(String group) { 
        this.group = group; }
    public int getCourse() { 
        return course; }
    public void setCourse(int course) { 
        this.course = course; }
    public double[] getGrades() { 
        return grades; }
    public void setGrades(double[] grades) { 
        this.grades = grades; }
}

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Иван Иванов", "ИВС-11", 1, new double[]{4, 3, 5}));
        students.add(new Student("Марина Петрова", "ИВС-11", 1, new double[]{2, 2, 3}));
        students.add(new Student("Александр Смирнов", "ИВС-11", 2, new double[]{3, 4, 5}));
        
        removeLow(students);
        System.out.println("\nСтуденты после удаления слабых учеников:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        
        NextCourse(students);
        System.out.println("\nСтуденты после повышения курсов:");
        for (Student student : students) {
            System.out.println(student.getName() + ", Курс: " + student.getCourse());
        }
        
        System.out.println("\nСтуденты первого курса:");
        printStudents(students, 1);
    }

    public static void removeLow(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (calculate(student.getGrades()) < 3) {
                iterator.remove(); 
            }
        }
    }

    public static void NextCourse(Set<Student> students) {
        for (Student student : students) {
            if (calculate(student.getGrades()) >= 3 && student.getCourse() != 5) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет студентов на указанном курсе.");
        }
    }

    private static double calculate(double[] grades) {
        if (grades.length == 0) return 0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
