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
    } // TC : O(n * n)

    public static void main(String[] args) {
        solve();
    }
}
