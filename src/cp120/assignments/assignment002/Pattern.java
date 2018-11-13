package cp120.assignments.assignment002;

public class Pattern {

    // Driver Function
    public static void main (String args[])
    {
        int n = 7;
        int i = n, j, k = n;

        // outer loop to handle number of rows
        //  n in this case
        while (n > 0) {
            for (j = 0; j < n; j++) {
                // loop to handle number of columns
                for (j = 0; j <= i; j++) {
                    // printing pattern
                    if ((n % 2) != 0)
                        System.out.print("#");
                    else {
                        if (j == 0) {
                            System.out.print(" ");
                        } else if (j == k) {
                            System.out.print(" ");
                        } else {
                            System.out.print("#");
                        }
                    }
                }

                // ending line after each row
                System.out.println();
            }
            n--;
        }
    }
}
