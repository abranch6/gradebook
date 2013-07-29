package gradebook.model;

import java.util.ArrayList;

public class ArrayListDB<T extends Storable> implements GradebookDB<T>
{
    ArrayList<T> list;

    public ArrayListDB()
    {
        list = new ArrayList<T>();
    }

    public void put(T object)
    {
        list.add(object);
    }

    public boolean delete(T object)
    {
        return list.remove(object);
    }

    public T get(String id)
    {
        int i = 0;
        boolean found = false;
        T ret = null;
        while(i < list.size() && !found)
        {
            if(list.get(i).getId().equals(id))
            {
                ret = list.get(i);
                found = true;
            }
            i++;
        } 
        return ret;
    }

    public T[] toArray(T[] array)
    {
        return list.toArray(array);
    }

    public int size()
    {
        return list.size();
    } 
}
