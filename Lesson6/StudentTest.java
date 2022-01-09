class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student nick = new Student(1,"Nick", "Borz", 3);
        studentArrayList.add(nick);
        Student vlad = new Student();
        studentArrayList.add(vlad);
        Student kate = new Student(3, "Kate", "Kash", 3, 5f, 5f, 4.3f);
        studentArrayList.add(kate);
        for (Student student: studentArrayList) {
            System.out.println(student.getName());
        }
    }
    //public static float getAverage(Student student) {
    //    return (student.getEconomicAverage() + student.getForeignAverage() + student.getMathAverage()) / 3;
    //}
}

class Student {
    private int studentCard;
    private String name;
    private String surname;
    private int yearOfStudy;
    private float mathAverage;
    private float economicAverage;
    private float foreignAverage;

    public Student(int studentCard, String name, String surname, int yearOfStudy, float mathAverage, float economicAverage, float foreignAverage) {
        this.studentCard = studentCard;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
        this.mathAverage = mathAverage;
        this.economicAverage = economicAverage;
        this.foreignAverage = foreignAverage;
    }

    public Student(int studentCard, String name, String surname, int yearOfStudy) {
        this.studentCard = studentCard;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public float getMathAverage() {
        return mathAverage;
    }

    public float getEconomicAverage() {
        return economicAverage;
    }

    public float getForeignAverage() {
        return foreignAverage;
    }
}
