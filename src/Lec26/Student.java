package Lec26;

public class Student {
    private int age = 19;
    private String name = "kaju";

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        try {
            if (age < 0){
                throw new Exception("baklol -ve age nhi hota hai");
            }
            this.age = age;
        } catch (Exception e){
            e.printStackTrace();
        }

        finally {
            System.out.println("I am in finally coding");
        }

    }

    public String getName() throws Exception {
        setAge(9);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {



    }
}
