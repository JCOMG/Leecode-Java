package com.jimmychuang.tutorial.java;

public class Solutin63 {

    // using dynamic programming , aka DP
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;

        int [][] dp = new int[rows][columns];

        boolean flag = false ;

        //fill rows first , if obstacle is in the rows such as [0][1],[0][2],[0][3] ...etc
        for ( int i = 0; i < columns; i++)
        {
            if (flag || obstacleGrid[0][i] == 1)
            {
                flag = true;
                dp[0][i] = 0; }

            else
            {
                dp[0][i] = 1;
            }

        }

        //fill column , if obstacle is in the column such as [1][0],[2][0],[3][0] ...etc

        for (int j = 0; j < rows ; j++)
        {

            if (flag || obstacleGrid[j][0] == 1 )
            {
                flag = true;
                dp[j][0] = 0;
            }
            else
            {
                dp[j][0] = 1;
            }
        }
        // if obstacle is is in the middle such as [1][1],[1][2],[3][2],[4][5] ...etc
        for ( int i = 1 ; i < rows ;i++)
        {
            for(int j = 1; j < columns;j++)
            {
                if (obstacleGrid[i][j] == 1)
                {
                    dp[i][j] = 0;
                }
                else
                {
                   dp[i][j] = dp[i-1][j] + dp[i][j-1];
                                   }

            }



        }

        return dp[rows-1][columns-1];

    }


    public static void main(String[] args) {
        int[][] result = new int[2][1];
        Solutin63 a = new Solutin63();
        System.out.println(a.uniquePathsWithObstacles(result));
    }

}
