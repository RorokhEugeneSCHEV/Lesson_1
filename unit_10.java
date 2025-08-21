public class unit_10 {
    public static void main(String[] args) {
        int[]number = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i=0; i< number.length; i++){
              if(number[i]==0){
                 number[i]=1;
                 System.out.println(number[i]);
              }
              else { 
                 number[i]=0;
                 System.out.println(number[i]);
            }
        }
    }
}
