import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  LinkedList <Integer> li=new LinkedList<>();
  for(int i=1;i<=10;i++){
    li.add(i);
  }
  for(int i:li){
    System.out.println(i);
  }
  }}
