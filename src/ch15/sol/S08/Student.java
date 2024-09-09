package ch15.sol.S08;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return studentNum == student.studentNum; // name 비교 제외
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum); // name을 제외하고 studentNum만 해시값으로 사용
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", name='" + name + '\'' +
                '}';
    }
}
