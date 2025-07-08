public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.2); // Sözlü etkisi %20
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.2);   // Sözlü etkisi %20
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.3);   // Sözlü etkisi %30

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(60, 60, 60);
        s1.addBulkVerbalNote(90, 90, 90);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(80, 50, 40);
        s2.addBulkVerbalNote(100, 90, 60);
        s2.isPass();
    }
}
