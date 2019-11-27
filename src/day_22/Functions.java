package day_22;

import java.io.*;
import java.util.*;

/**
 * ClassName:Functions
 * Package:day_22
 * Description:
 *
 * @date:2019/11/27 18:53
 * @author:Wang Jun
 */
public class Functions {

    //读入数据
    public static Point[] read(File file){
        Point[] points = new Point[85];//总共85个点
        int index = 0;
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file),"GBK");
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            line = br.readLine();//第一行没有任何有用数据，所以只是读一下
            System.out.println(line);
            String []kuai = new String[3];//分三块存储点的序号、横坐标、纵坐标
            while (line!=null){
                line = br.readLine();
                if (line!=null){
                    kuai = line.split(",");
                    points[index] = new Point(Integer.valueOf(kuai[0]),Double.valueOf(kuai[1]),Double.valueOf(kuai[2]));
                    System.out.println(points[index]);
                    ++index;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return points;
    }

    //计算数据
    public static HashMap<String,Double> calculate(Point[] points){
        HashMap<String,Double> map =new HashMap<>();
        double juli=0;
        for (int i=0;i<points.length-1;++i)
            for (int j=i+1;j<points.length;++j){
                juli = Point.distance(points[i],points[j]);
                map.put(i+"号点与"+j+"号点之间的距离：",juli);
            }
        return map;
    }

    //排序数据
    public static void paixu(HashMap<String,Double> map,File file){
        Set<Map.Entry<String,Double>> set = map.entrySet();
        List<Map.Entry<String,Double>> list = new ArrayList<>(map.entrySet());
        list.addAll(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o1.getValue().compareTo((o2.getValue()));
            }
        });
        StringBuffer str = new StringBuffer();
        for (Map.Entry se :list){
            System.out.println(se.getKey()+""+se.getValue());
            str.append(se.getKey()+""+se.getValue()+"\n");
        }
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(str.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //写入数据
    public static void xieru(HashMap<String,Double> map,File file){
        StringBuffer str =new StringBuffer();
        for (Map.Entry<String,Double> set :map.entrySet()){
        str.append(set.getKey()+""+set.getValue()+"\n");
    }
        try {
        FileWriter fw = new FileWriter(file);
        fw.write(str.toString());
        fw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
