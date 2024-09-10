package ch15.sol.sol10;

public class Student implements Comparable<Student>{
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //점수순
        return this.score - o.score;
        //점수 역순
        //return this.score + o.score;
        //id순
        //return o.id.compareTo(this.id);
        //id 역순
        //return this.id.compareTo(o.id);
    }
}
