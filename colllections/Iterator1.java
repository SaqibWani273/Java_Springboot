package colllections;

public class Iterator1 {
    public static void show() {
        var list = new GenericList<String>();
        list.add("something");
        list.add("is ");
        list.add("here!.");
        var iter=list.iterator();
        while(iter.hasNext()){
        
            System.out.println(iter.next());
        }
        for(var item:list){
            //for each is enhanced  iterator approach

            System.out.println(item);
        }
        
    }
}
