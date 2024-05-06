
class Test{
    static String staticVar="something";
    Test(){
        System.out.println("constructor of Test");
    }
    static{
        //gets called only once when the class is loaded & is used 
        //to initialize the static variables & other taks needed
        System.out.println("static bloc of Test");
    }
}
class StaticBlock{
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Test.staticVar);
        // Test test=new Test();//class gets loaded when the first instance of it is 
        // //created
        // Test test1=new Test();
        // //if no class instance is created & we still want to load class
        Class.forName("Test");
    }

}
