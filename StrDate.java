import java.text.SimpleDateFormat;  
import java.util.Date;  
public class StrDate
 {  
public static void main(String[] args)throws Exception {  
    String sDate1="08/08/2002";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    System.out.println(sDate1+"t"+date1);  
}  
}  
