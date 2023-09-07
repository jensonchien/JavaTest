package HW8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex1_Object {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		//• 請建立一個Collection物件並將以下資料加入：
		//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
		//Object物件、“Snoopy”、BigInteger(“1000”)
		List<Object> list = new ArrayList<Object>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
        System.out.println("使用Iterator印出所有元素");
        Iterator<Object> it = list.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        System.out.println("=============");
        
        System.out.println("使用傳統for印出所有元素");
        for(int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i));
        }
        System.out.println("=============");
        
        System.out.println("使用for each印出所有元素");
        for(Object objs : list) {
        	System.out.println(objs);
        }
        
        System.out.println("=============");
        
      //• 移除不是java.lang.Number相關的物件
        System.out.println("移除不是java.lang.Number相關的物件");
        List<Object> list2 = new ArrayList<Object>();
        for(Object objs : list) {
        	if(objs instanceof Number)
        		list2.add(objs);
        }
      //• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
        for(Object objs : list2) {
        	System.out.println(objs);
        }
        System.out.println("=============");

	}

}
