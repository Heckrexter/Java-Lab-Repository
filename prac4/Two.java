public class Two {
    String name;
    Two(String name) {
        this.name = name;
    }
    void changename( Two obj, String name ) {
        obj.name = name;
    }
    public static void main(String[] args) {
        Two obj1 = new Two("obj1");
        System.out.println(obj1.name);
        obj1.changename(obj1, "obj2");
        System.out.println(obj1.name);
        
    }
}
