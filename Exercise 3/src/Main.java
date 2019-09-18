import com.enigma.model.Circle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5));
        circles.add(new Circle(2));
        circles.add(new Circle(1));
        circles.add(new Circle(3));

//        System.out.println(circles.size());//ukurannya
//        Circle circle = circles.get(0);//pada ngambil objek ke index berapa masuk ke circle
//        System.out.println(circles.indexOf(circle));//index ke circle diatas yg indexnya
//        System.out.println(circles.lastIndexOf(circle));//udah ada method equals, dari circle index terakhir dari index yg punya 1 yg sama adalah
//        System.out.println(circles.contains(new Circle(5)));

//        System.out.println(circles.size());
//        for (int i = 0; i < circles.size(); i++){
//            Circle circle1 = circles.get(i);
//            System.out.println(circle1.print());
////            System.out.println(circle.contains(new Circle(5)));//compare object dengan object dengan value yg dicarinya
//        }
        Circle ygKuCari = new Circle(2);
        System.out.println("Yang ku cari:"+ygKuCari);

        Iterator<Circle> iterator = circles.iterator();

        while(iterator.hasNext()){
            Circle circle = iterator.next();
            System.out.println(circle.getR());
            if (circle.equals(ygKuCari)){
                iterator.remove();
            }

        }
        System.out.println("=================");
        System.out.println(circles.size());
        System.out.println("=================");
        iterator = circles.iterator();
        while (iterator.hasNext()){
            Circle circle = iterator.next();
            System.out.println(circle.getR());
        }

    }
}
