package project2;

class Data {
    private String name;

   
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name= name;
    }
}
public class PrivateAccess {
    public static void main(String[] main){
        Data d = new Data();

       
        d.setName("Set private string");
        System.out.println(d.getName());
    }
}