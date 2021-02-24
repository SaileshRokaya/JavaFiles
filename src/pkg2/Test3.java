
package pkg2;

public class Test3 {
    
    public static void main(String[] args) {
        String str1 = "Patan College for Professional Studies";
        //char charAt (int index)
        //int length()
        
        int len = str1.length();
        char ch = str1.charAt(0);
        
        System.out.println(len);
        System.out.println(ch);
        
       
        
        //int compareTo(String anotherString)
        String str2="KTM";
        String str3="Ktm";
        int res1 = str2.compareTo(str3);
        if (res1==0){
            System.out.println("Equals");}
        else
        {
            System.out.println("Not Equails");
        }
//        System.out.println(res1);
        
    }
    
}
