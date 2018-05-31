package com.examples.base.service;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Condition;

import com.examples.base.mapper.CommonMapper;

public abstract class BaseService<T> {

	@Autowired
    protected CommonMapper<T> mapper;

    private Class<T> modelClass;    // 当前泛型真实类型的Class

    @SuppressWarnings("unchecked")
	public BaseService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }
    /**
     * 保存所有的数据，null也会插入
     * @param model
     * @return int
     */
    public int save(T model) {
    	return mapper.insertSelective(model);
    }
    /**
     * 根据主键删除数据
     * @param id
     * @return int
     */
    public int deleteById(String id) {
    	return mapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据单个或者多个字段删除数据
     * @param id
     * @return int
     */
    public int delete(T model) {
    	return mapper.delete(model);
    }
    /**
     * 根据多个主键删除数据
     * @param ids
     * @return int
     */
    public int deleteByIds(String ids) {
    	return mapper.deleteByIds(ids);
    }
    /**
     * 根据主键,会对字段进行判断再更新(如果为Null就忽略更新)，如果你只想更新某一字段，可以用这个方法。
     * @param model
     * @return int
     */
    public int updateByPrimaryKeySelective(T model) {
    	return mapper.updateByPrimaryKeySelective(model);
    }
    /**
     * 根据主键修改所有注入字段
     * @param model
     * @return int
     */
    public int updateByPrimaryKey(T model) {
    	return mapper.updateByPrimaryKey(model);
    }
    /**
     * 根据主键查询
     * @param id
     * @return T
     */
    public T findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
    
    /**
     * 根据一个或者多个字段值确定一个对象
     * @param model
     * @return T
     */
    public T findOne(T model) {
        return mapper.selectOne(model);
    }
    /**
     * 根据一个字段值确定一个对象
     * @param model
     * @return T
     */
    public T findBy(String fieldName, Object value) throws TooManyResultsException {
    	T model = null;
        try {
        	model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        return mapper.selectOne(model);
    }
    
    /**
     * 根据多个主键查询列表
     * @param ids
     * @return List<T>
     */
    public List<T> findByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    /**
     * 根据对象的字段查询
     * @param model
     * @return List<T>
     */
    public List<T> findList(T model) {
        return mapper.select(model);
    }
    
    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }
    /**
     * 查询所有信息
     * @return List<T>
     */
    public List<T> findAll() {
        return mapper.selectAll();
    }
}
