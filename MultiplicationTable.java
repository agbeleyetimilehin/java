
public class MultiplicationTable {
    public static void main(String[] args)  {
        String multiply[][] = new String[21][21];
        for (int i = 1; i < multiply.length; i++) {
            for (int j = 1; j < multiply.length; j++) {
                multiply[i][j] = i + "*" + j + "=" + i * j;
                System.out.printf("%d * %d = %d \n" , i , j, i * j );
            }
            System.out.println();
        }
    }
}
