package pack1;
import java .util.*;
class Sample{
public static void main(String[] args){
HashMap h=new HashMap();
h.put("100","shiva");
h.put("101","ram");
h.put("102","shankar");
System.out.println(h);
System.out.println(h.get("101"));
System.out.println(h.remove("102"));
System.out.println(h.containsKey("100"));
System.out.println(h.containsValue("ram"));
System.out.println(h.size());
System.out.println(h);
Set t=h.keySet();
System.out.println(t);
Collection c=h.values();
System.out.println(c);
Set s1=h.entrySet();
System.out.println(s1);


}
}