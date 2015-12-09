package exceptionHandling;

class myCalculator{
    public myCalculator(){
        //do nothing
    }
    
    public int power(int i, int j) throws Exception{
        if(i < 0 || j < 0){
            throw new Exception("n and p should be non-negative");
        }else{
            return (int)Math.pow(i,j);
        }
           
    }
}