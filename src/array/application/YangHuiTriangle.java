package array.application;
//Java��Ŀʵս�������������Σ�ʹ�ö�ά���飩
public class YangHuiTriangle {
    public static void main(String[]argfs){
        int[][] yangHuiTriangle = new int[10][];//����Ҫ�����������ǵ�����
        for (int i = 0;i<yangHuiTriangle.length;i++){
            yangHuiTriangle[i] = new int[i+1];
            for (int j = 0;j<=yangHuiTriangle.length-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                if (j==0|j==i){
                    yangHuiTriangle[i][i] = 1;
                }else {
                    yangHuiTriangle[i][j] = yangHuiTriangle[i-1][j-1]+yangHuiTriangle[i-1][j];
                }
                System.out.print(yangHuiTriangle[i][j]+" ");

            }
            System.out.println();

        }


    }
}
