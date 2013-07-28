package gradebook.model;

public interface GradebookDB<T extends Storable>
{
    public void put(T object);
    public boolean delete(T object);
    public T get(T object);
    public T[] getAll();
    public int size();
}
