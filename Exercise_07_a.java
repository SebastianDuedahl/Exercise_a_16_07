package Chapter_16_a_01;
import java.util.*;
/*
Write a method called deleteBack that deletes the last value (the value at the back of the list) and returns the
deleted value. If the list is empty, throw a NoSuchElementException.
 */

public class Exercise_07_a
{

    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();

        list.add(1);
        list.add(6);
        list.add(2);
        list.add(9);

        deleteBack(list);

    }

    public static void deleteBack(LinkedIntList list)
    {

        if (list.size() == 0)
        {
            throw new NoSuchElementException();
        }
        else
            {

            int listSize = list.size() - 1;

            System.out.println(list.get(listSize));
            list.remove(listSize);

            }
    }

}