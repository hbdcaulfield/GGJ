
package gamejam;


public class Problem {
    private String [] questionSet = new String [10];
 //   private String [] answer;
    private int index;
//    private int a;
    private int points;
    
    public Problem(int index){
        this.index = index;
        questionSet[0] = "this is question 1";
        questionSet[1] = "this is question 2";
        
        
    }
    
    public String setDetails(String[] arr , int n){
     String details ="";
        
         if (n == 0){
            details = "Bhlaaaa blaaa";
        }
        if (n == 1 ){
            details = "\"Bhlaaaa blaaa";
        }
    
        return details;    
    }
    
    public String  setAns1(String[] arr , int n ){ 
        String ans ="";
        
         if (n == 0){
            ans = "this is ans 1 for question 1";
        }
        if (n == 1 ){
            ans = "this is ans 1 for question 2";
        }
    
        return ans; 
    }
    
    public String  setAns2(String[] arr , int n ){ 
        String ans ="";
        
        if (n == 0){
            ans = "this is ans 2 for question 1";
        }
        if (n == 1 ){
            ans = "this is ans 2 for question 2";
        }
    
        return ans; 
    }
    
    public String  setAns3(String[] arr , int n ){ 
        String ans ="";
        
        if (n == 0){
            ans = "this is ans 3 for question 1";
        }
        if (n == 1 ){
            ans = "this is ans 3 for question 2";
        }
    
        return ans; 
    }
    
    
    /*************THIS ARE THE TO STRING METHO
     * @return D*/
     public String toStrings(){
        
        return questionSet[index];
    }
    
     public String getDetails(){
         return setDetails(questionSet , index);
     }
     
    public String getAn1(){
        return setAns1( questionSet , index );
    }
    
    public String getAn2(){
        return setAns2(questionSet , index);
    }
    
    public String getAn3(){
        return setAns3(questionSet , index);
    }
    
   
    
   
}
