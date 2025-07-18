// 1. Print Matrix sum row - wise
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

