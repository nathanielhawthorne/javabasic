package array.application;

import javax.naming.NamingEnumeration;

//Java商品信息查询
/*
假设在仓库系统中，每件商品都有 3 个库存信息，分别是入库量、出库量和当前库存量。
定义一个一维数组来存储 5 件商品的名称，并定义一个二维数组来存储这 5 件商品的 3 个库存信息。
用户可以根据商品名称查询该商品的所有库存，也可以查看某个类别库存下数量小于 100 的商品名单，
并将该类别的所有库存量按从低到高的顺序排列。
 */
public class JavaProductInformationQuery {
    public static void main(String[]args){
        String[] product = {"葡萄","橘子","音响","机箱","饮料"};
        int[][][] Inventory = new int[500][500][500];//定义入库量、出库量和库存量的最大值
        for (int i = 0;i<Inventory.length;i++){
            for (int j = 0;j<Inventory.length;j++){
                for (int k = 0;k<Inventory.length;k++){
                    System.out.print(Inventory[i][j][k]);
                }
            }
        }

    }
}
