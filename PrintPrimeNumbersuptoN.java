class PrintPrimeNumbersuptoN{
    public static void logic(){

        int n=50;
        for(int i=2;i<=n;i++){
           int count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0){
                  count++;
                }

            }

            if(count==0){
              System.out.println(i);
            }

        }

    }

    public static void main(String[] args){
       logic();
    }
}