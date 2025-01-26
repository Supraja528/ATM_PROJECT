package AtmProject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImplement implements AtmInterface {
    Atm atm=new Atm();
    Map<Double,String> miniStatement=new HashMap<>();
    public void viewBalance(){
        
             System.out.println("AvailableBalance:"+atm.getBalance());
    }
    public void withdrawAmount(double withdrawAmount){
        if(withdrawAmount%500==0){
            if(withdrawAmount<=atm.getBalance()){
                System.out.println("collect the cash"+withdrawAmount);  
                atm.setBalance(atm.getBalance()-withdrawAmount);  
                miniStatement.put(withdrawAmount,"Amount withdrawn");
                viewBalance(); 
            }else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
             System.out.println("Enter the amount in terms of 500");
        }
    }
    public void depositAmount(double depositAmount){
        System.out.println("depositedAmount is:"+depositAmount);
        atm.setBalance(atm.getBalance()+depositAmount);
        miniStatement.put(depositAmount,"Deposited Successfully");
    }
    public void viewMiniStatement(){
        Set<Double> set=miniStatement.keySet();
        for(Double d:set){
            System.out.println(d+"="+miniStatement.get(d));
        }
    }
}
