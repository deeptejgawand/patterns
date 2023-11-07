class Patterns{
     //while solving pattern question you must notice these things in problem
        //how many rows are there in a pattern (horizontal elements)
        //how many columns are there per row
        //what type of element you want to print number or star
    public static void pattern1(){
        /*
        *
        * *
        * * *
        * * * *
        in this particular question there are 4 horizontal lines so outer loop will run 4 times
        and each row has same number of column so for each row column will run for same number of times
        pattern will be printed row by row so we must include line break
         */
        for(int row=1;row<=4;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }
    public static void pattern2(){
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for(int row=1;row<=5;row++){
            for(int col=1;col<=5;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(){
        /*
         *****
         ****
         ***
         **
         *
         */
        for(int row=1;row<=5;row++){
            for(int col=5;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        /*
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(){
        /*
         *
         * *
         * * *
         * * * *
         * * *
         * *
         * 
         */
        for(int row=1;row<=4;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println
        }
    }
    public static void main(String args[]){
        pattern4();


    }
}