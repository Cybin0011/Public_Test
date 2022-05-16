package exer2;

import java.util.*;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-05-16 16:37
 */
public class DAO <T>{
    Map<String,T> map=new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id ,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        List <T> list=new ArrayList<>();
        Collection<T> coll=map.values();
        for (T t:coll) {
            list.add(t);
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
}
