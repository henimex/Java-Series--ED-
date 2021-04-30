package hendev.generics;

public interface IEntityRepository<T extends IEntity> {
    void Add(T entity);

    void Update(T entity);

    void Delete(T entity);
}
