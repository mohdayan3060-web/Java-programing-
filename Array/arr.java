public class arr{
    public static void main(String[] args){
        int[] newarr= new int[3];
        newarr[0]=10;
        newarr[1]=20;
        newarr[2]=30;
        System.out.println(newarr[0]+" "+newarr[1]+" "+newarr[2]+" ");
        int[] rollnums=new int[10];
        int x=100;
        // fill the array values using for loops 
        for(int i=0; i<10;i++){
            rollnums[i]=x;
            x++;
        }
        //print array using loops 
        int marks=45;
          for(int i=0; i<10;i++){
           System.out.print(rollnums[i]+" ");
        }

        System.out.println();


        //mulitidiemsional array
        int[][] Stu_marks=new int[3][3];
        for (int i=0; i<3;i++){//here i-->rows j-->colns
            for (int j=0; j<3;j++){
                Stu_marks[i][j]=marks;
                marks++;
            }
        }
        //apply array.length concepts
        // for (int row=0;row<Stu_marks.length;row++){
        //     for(int col=0;col<Stu_marks[row].length;col++){

        //     }
        // }


        //Print multidimentional array 
         
        for (int i=0; i<3;i++){
            for (int j=0; j<3;j++){
                System.out.print(Stu_marks[i][j]+ " ");
            }
            System.out.println();
        }

       //multi Dimentional array -->each diffrenth columns 
       int[][] multiarray= new int[3][];
       multiarray[0]=new int[1];
       multiarray[1]=new int[2];
       multiarray[2]=new int[3];


       //1D array 
       int[] arr01={21,22,23,24,25,26,27,28,29,20};
        for(int i=0; i<arr01.length;i++){
            System.out.print(arr01[i]+" ");

        }

        //Basic String 
        String fname="Mr.";
        String lname="Ayan";
        System.out.println(" "+fname+lname);



    }
}