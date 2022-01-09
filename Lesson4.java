/*
Создайте 2 класса. 1-ый назовите Student. Он должен содержать в себе следующие атрибуты: номер студенческого билета, имя, фамилию,
год обучения, средняя оценка по математике, средняя оценка по экономике, средняя оценка по иностранному языку.
2-ой класс назовите StudentTest. В нём Вы должны будете создать 3 разных объекта класса Student, 
вывести на экран в читабельном виде среднюю арифметическую оценку каждого студента (учитывая все 3 предмета).
*/

class Lesson4 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student nick = new Student(1,"Nick", "Borz", 3, 4.6F, 4f, 4.8f);
        studentArrayList.add(nick);
        Student vlad = new Student(2, "Vlad", "Konch", 3, 3f, 3f, 3.5f);
        studentArrayList.add(vlad);
        Student kate = new Student(3, "Kate", "Kash", 3, 5f, 5f, 4.3f);
        studentArrayList.add(kate);
        for (Student student: studentArrayList) {
            System.out.println(student.toString());
        }
    }
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

    public float getAverageGrade() {
        return (mathAverage + economicAverage + foreignAverage) / 3;
    }

    @Override
    public String toString() {
        return name + ": " + getAverageGrade();
    }
}
