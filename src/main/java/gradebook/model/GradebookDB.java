public interface GradebookDB<T>
{
    public void put(T object);
    public void delete(T object);
    public T get(T object);
    public T[] getAll();
}
