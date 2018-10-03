public class Student {
    private String name;
    private int id;
    private int year;


    public void setName(String newName) {
        this.name = newName;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
    public Student (String name, int id, int year){
        this.name = name;
        this.id = id;
        this.year = year;
    }
    public static void main(String[] args) {
        Student student = new Student("Boo", 1, 1);
        System.out.println("ok");
    }
}

