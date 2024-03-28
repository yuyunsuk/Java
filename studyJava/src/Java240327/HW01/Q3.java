package Java240327.HW01;

/*  1) 아래의 필드를 가지는 Student 클래스를 선언하시오
        String name // 학생이름
        int ban // 반
        int no // 번호
        int kor // 국어점수
        int eng // 영어점수
        int math // 수학점수
    2) main 메서드의 실행결과가 표시된대로 출력되도록 toString을 오버라이딩하시오
    3) 평균값을 계산하는 getAvg 메서드를 만드시오

    결과 예시
    1반 3번 동수 : 평균 90점
    2반 10번 창수 : 평균 78점
    3반 27번 영철 : 평균 86점
*/
class Student {
    String name; // 학생이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return String.valueOf(getBan()) + " " + String.valueOf(getNo()) + " " + getName();
    }

    int getAvg() {
        return (getKor() + getEng() + getMath())/3;
    }

}

public class Q3 {
    public static void main(String[] args) {
        Student a = new Student("동수", 1, 3, 90, 80, 100);
        Student b = new Student("창수", 2, 10, 80, 70, 85);
        Student c = new Student("영철", 3, 27, 95, 75, 90);

        System.out.println(a.toString() + " : 평균 " + a.getAvg() + "점"); //1반 3번 동수 : 평균 90점
        System.out.println(b.toString() + " : 평균 " + b.getAvg() + "점"); //2반 10번 창수 : 평균 78점
        System.out.println(c.toString() + " : 평균 " + c.getAvg() + "점"); //3반 27번 영철 : 평균 86점
    }
}
