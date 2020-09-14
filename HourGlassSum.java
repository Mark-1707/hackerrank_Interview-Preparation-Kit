import java.io.*;
import java.util.*;

public class HourGlassSum {

    static int hourglassSum(final int[][] arr) {

    final int maxX = 3; 
    final int maxY = 3;
    int total =-1000 ; 
   
    // begin at y == 0
    for (int y = 0; y <= maxY; y++) {
        for (int x = 0; x <= maxX; x++) {
            // sum the top of hourglass
            int sum = arr[y][x] + arr[y][x+1] + arr[y][x+2];
            
            // get the middle of hourglass
            sum += arr[y+1][x+1];
            
            // sum the bottom of hourglass
            sum += arr[y+2][x] + arr[y+2][x+1] + arr[y+2][x+2];
            
            if (total <= sum)
                 total = sum;
        }
    }
    
    return total;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            final String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                final int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        final int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
