public class Class {
    public static void main(String[] args) {
        City bj = new City();
        bj.cityname = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.cityname);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);

        Person ming = new Person();
        ming.setName("Ming");
        ming.setAge(18);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());

        Animal Mon = new Animal("Mon", 8);
        Animal Abc = new Animal("Abc");
        Animal Def = new Animal();
        Def.name = "Def";
        System.out.println(Mon.name + "\t" + Abc.age + "\t" + Def.name);

        Student mike = new Student("Mike", 18, 90);
        Student s = new Student("小红", 20, 99);
        Student ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());

    }
}

class City {
    public String cityname;
    public double latitude;
    public double longitude;
}

class Person {
    protected String name;
    protected int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}


class Animal {
    String name;
    int age = 18;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int score;

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @SuppressWarnings("unused")
    public Student() {
    }
}

class PrimaryStudent extends Student {
    protected int grade;

    public PrimaryStudent(String name, int age, int score, int grade){
        super(name, age, score);
        this.grade = grade;
    }
}