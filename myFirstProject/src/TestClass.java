public class TestClass {

    public static void main(String[] args) {


        ClassProject e1 = new ClassProject();
        ClassProject e2 = new ClassProject();

        ClassProject.a = 10;
        ClassProject.staticPrint();
        ClassProject.staticPrint();
        ClassProject.staticPrint();
        ClassProject.a = 22;
        e1.print();
        ClassProject.a = 75;
        e2.print();
    }

}
