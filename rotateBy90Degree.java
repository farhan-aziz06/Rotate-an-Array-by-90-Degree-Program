import java.util.Scanner;
public class rotateBy90Degree{
    public static void main(String[]args) {
        Scanner console = new Scanner(System.in);
        try{
            System.out.println("Enter Rows and Columns: ");
            int row = console.nextInt();
            int col = console.nextInt();

            int [][] array = new int[row][col];
            System.out.println("Please Enter Array Elements: ");
            for (int i=0; i< row; i++){
                for(int j =0; j<col;j++){
                    array[i][j]=console.nextInt();
                }
            }
            for (int i=0; i< array.length; i++){
                for(int j =i; j<array[0].length;j++){
                    int temp = array[i][j];
                    array[i][j]=array[j][i];
                    array[j][i]=temp;
                }
            }
            for (int i=0; i< array.length; i++){
                int leftIndex=0;
                int rightIndex=array.length-1;

                while(leftIndex<rightIndex){
                    int temp = array[i][leftIndex];
                    array[i][leftIndex]=array[i][rightIndex];
                    array[i][rightIndex]=temp;

                    leftIndex++;
                    rightIndex--;
                }
            }
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[0].length;j++){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }

        }catch(Exception e){
            System.out.println("There is Exception: "+ e);
        }finally{
            console.close();
        }
    }
}