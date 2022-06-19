import java.util.Arrays;
import java.util.Comparator;

public class SortInJava {
    
    static class Student implements Comparable{
        int age;
        String name;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age + 
                    ", name='" + name + '\'' + 
                    '}';
        }

        @Override
        public int compareTo(Object other) {
            // so sanh this and other
            Student otherStudent = (Student)other;

            // 0 neu this = other
            // 1 neu this > other
            // -1 neu this < other
            if (this.age == otherStudent.age) {
                return 0;
            } else if (this.age > otherStudent.age) {
                return 1;
            }
            return -1;

        }
    }
    public static void main(String[] args) {
        // #1. Sort an integer array
        int[] intArray = {3,2,1,0};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        // #2. Sort an String array
        String[] stringArray = {"1", "00000", "32", "185", "13", "33", "114", "11119"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        // #3. Sort a Student array with interface Comparable
        Student[] students = {new Student("CAA", 20), new Student("8888", 10)};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // #4. Sort a Student array with Comparator
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student before, Student after) {
                // 0 before = after
                // 1 before > after
                // -1 before < after
                return before.name.compareTo(after.name);
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
