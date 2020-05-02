package ge.cse.di;

public class Main {
    public static void main(String[] args) {
        UniversityDemo demo = new UniversityDemo();
        demo.setStudent(new BachelorStudent());
        demo.print();

        UniversityDemo demo1 = new UniversityDemo();
        demo1.setStudent(new MasterStudent());
        demo1.print();

        UniversityDemo demo2 = new UniversityDemo();
        demo2.setStudent(new PHDStudent());
        demo2.print();
    }
}
