package com.jimmychuang.tutorial.java;

    public class columnrow {

        public static void main(String[] args) {


            int col = 0;
            int row = 0;
            for ( row = 0 ; row <= 5 ; row++)
            {
                for (col = 0 ; col < row ; col ++)


                {
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }
/*第一步,在第 3 行程式碼定義了兩個迴圈變數 i 和 j ,其中 i = row為外層迴圈變數,j = col 為內層迴圈變數。

                第二步,在第 4 行程式碼將 i 初始化為 1,條件 i<=5 為true,首次進入外層迴圈的迴圈體。

            第三步,在第 5 行程式碼將 j 初始化為 1,由於此時 i 的值為 1,條件 j<=i 為 true,首次進入內層迴圈的迴圈體,列印一個“ * ”。

            第四步,執行第 5 行程式碼中內層迴圈的操作表示式 j++ ,將 j 的值自增為 2。

            第五步,執行第 5 行程式碼中的判斷條件 j<=i ,判斷結果為 false,內層迴圈結束,執行後面的程式碼,列印換行符。

            第六步,執行第 4 行程式碼中外層迴圈的操作表示式 i++, 將 i 的值自增為 2。

            第七步,執行第 4 行程式碼中的判斷條件 i<=5 ,判斷結果為 true,進入外層迴圈的迴圈體,繼續執行內層迴圈。

            第八步,由於 i 的值為 2,內層迴圈會執行兩次,即在第二行列印兩個“ * ”,在內層迴圈結束時會列印換行符。

            第九步,依次類推,在第 3 行會列印 3 個“ * ”,逐行遞增,直到 i 的值為 8 時,外層迴圈的判斷條件 i<=7 結果為 false ,外層迴圈

            結束,整個程式也就結束了。*/




