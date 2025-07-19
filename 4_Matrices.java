// 1. Print matrix sum row - wise
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < m; j++) {
                sum += mat[i][j];
            }
            System.out.println(sum);
        }
    } // TC : O(n * m)

    public static void main(String[] args) {
        solve();
    }
}

// 2. Print matrix sum column wise
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for(int j = 0; j < m; j++) {
            int sum = 0;
            for(int i = 0; i < n; i++) {
                sum += mat[i][j];
            }
            System.out.println(sum);
        }
    } // TC : O(m * n)

    public static void main(String[] args) {
        solve();
    }
}

// 3. Submatrix sum
public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int[][] mat = new int[num][num];
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[][] ps_mat = new int[num][num];
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                ps_mat[i][j] = mat[i][j];
                if(i > 0) ps_mat[i][j] += ps_mat[i-1][j];
                if(j > 0) ps_mat[i][j] += ps_mat[i][j-1];
                if(i > 0 && j > 0) ps_mat[i][j] -= ps_mat[i-1][j-1];
            }
        }
        
        int submatrix_sum = ps_mat[x2][y2];
        if(x1 > 0) submatrix_sum -= ps_mat[x1-1][y2];
        if(y1 > 0) submatrix_sum -= ps_mat[x2][y1-1];
        if(x1 > 0 && y1 > 0) submatrix_sum += ps_mat[x1-1][y1-1];

        System.out.println(submatrix_sum);
    } // TC : O(n^2 + q)

    public static void main(String[] args) {
        solve();
    }
}

/*
2D Prefix Sum - Submatrix Sum Formula Explanation :
---------------------------------------------------
Building the Prefix Sum Matrix :
ps_mat[i][j] = mat[i][j] + ps_mat[i-1][j] + ps_mat[i][j-1] - ps_mat[i-1][j-1]

Calculating Submatrix Sum :
submatrix_sum = ps_mat[x2][y2] - ps_mat[x1-1][y2] - ps_mat[x2][y1-1] + ps_mat[x1-1][y1-1]

Visual Explanation..!
Let's understand with a concrete example:
    0   1   2   3
0 [ 1   2   3   4 ]
1 [ 5   6   7   8 ]
2 [ 9  10  11  12 ]
3 [13  14  15  16 ]

Step 1: Building Prefix Sum Matrix :
------------------------------------
The prefix sum at position `(i,j)` contains the sum of all elements from `(0,0)` to `(i,j)`.

Row 0:
- `ps[0][0] = 1`
- `ps[0][1] = 1 + 2 = 3`
- `ps[0][2] = 1 + 2 + 3 = 6`
- `ps[0][3] = 1 + 2 + 3 + 4 = 10`

Row 1:
- `ps[1][0] = 1 + 5 = 6`
- `ps[1][1] = (1+2) + (5+6) = 14`
- `ps[1][2] = (1+2+3) + (5+6+7) = 24`
- `ps[1][3] = (1+2+3+4) + (5+6+7+8) = 36`

Complete Prefix Sum Matrix :
    0   1   2   3
0 [ 1   3   6  10 ]
1 [ 6  14  24  36 ]
2 [15  33  54  78 ]
3 [28  60 102 144 ]

Step 2: Understanding the Construction Formula
----------------------------------------------
For `ps[i][j]`, we need sum from `(0,0)` to `(i,j)' :

ps[i][j] = mat[i][j]           // Current element
         + ps[i-1][j]          // Sum above current row
         + ps[i][j-1]          // Sum left of current column  
         - ps[i-1][j-1]        // Subtract overlap (counted twice)

Visual representation for ps[2][2] :
We want:     We add:           We add:           We subtract:
[ X  X  X ]  [ X  X  . ]       [ .  .  . ]       [ X  X  . ]
[ X  X  X ]  [ X  X  . ]   +   [ X  X  . ]   -   [ X  X  . ]
[ X  X 11]  [ .  . 11 ]       [ X  X 11 ]       [ .  .  . ]
           ps[i-1][j]=33      ps[i][j-1]=33     ps[i-1][j-1]=14

So: `ps[2][2] = 11 + 33 + 33 - 14 = 54` ✓

Step 3: Calculating Submatrix Sum :
-----------------------------------
Let's find the sum of submatrix from `(1,1)` to `(2,2)`:

Target submatrix :
[ .  .  .  . ]
[ .  6  7  . ]
[ . 10 11  . ]
```
Expected sum: `6 + 7 + 10 + 11 = 34`

Using the Formula :
submatrix_sum = ps[x2][y2] - ps[x1-1][y2] - ps[x2][y1-1] + ps[x1-1][y1-1]
              = ps[2][2]   - ps[0][2]     - ps[2][0]     + ps[0][0]
              = 54         - 6            - 15           + 1
              = 34 ✓
```

Inclusion-Exclusion Principle
----------------------------- 
ps[2][2] contains:           We subtract ps[0][2]:      We subtract ps[2][0]:
[ X  X  X  . ]               [ X  X  X  . ]             [ X  .  .  . ]
[ X  X  X  . ]               [ .  .  .  . ]             [ X  .  .  . ]
[ X  X  X  . ]               [ .  .  .  . ]             [ X  .  .  . ]
(Entire rectangle            (Top unwanted part)        (Left unwanted part)
from (0,0) to (2,2))

After subtracting both:      But we over-subtracted:    So we add back:
[ .  .  .  . ]               [ X  .  .  . ]             [ X  .  .  . ]
[ .  X  X  . ]               [ .  .  .  . ]             [ .  .  .  . ]
[ .  X  X  . ]               [ .  .  .  . ]             [ .  .  .  . ]
(Our target submatrix)       (Top-left corner           (ps[0][0] = 1)
                             subtracted twice)
*/
