
/**
 * Write a description of class testLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class testLinkedList
{
   public static void main(String[] args)
   {
       LinkedList<Integer>list = new LinkedList<>();
       
       list.append(0);
       list.append(5);
       list.append(7);
       list.append(4);
       System.out.print(list.getMax());
       
    }
}
