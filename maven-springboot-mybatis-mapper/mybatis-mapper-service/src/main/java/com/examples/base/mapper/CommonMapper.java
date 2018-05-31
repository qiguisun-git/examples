package com.examples.base.mapper;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承通用mapper，可以重写和选择需要的mapper方法，可以去掉一些不需要的方法（一般直接继承即可）
 * @Title BaseMapper.java
 * @Package com.examples.base.mapper
 * @param <T>
 * 特别注意，该接口不能被扫描到，否则会报错
 * 
 * 要求对实体类进行注解,如@Table,@Id等规则：
 * 在继承用用Mapper的接口的时候,需要指定Mapper的泛型,这个泛型就是指实体类.而这个实体类必须要符合以下规范:
 * 1.通用Mapper会默认为表名=实体类名,驼峰的话会转下划线,如UserInfo类对应的表为user_info
 * 2.如果上一条不满足的话,则可以在实体类上面加注解@Table(name="tablename")
 * 3.通用Mapper会默认将实体类的属性转为表的字段
 * 4.如果上一条不满足的话,加注解@Column(name="fieldname")
 * 5.实体类的有些属性 没有对应表的字段的话,则要在这个属性上面加上注解@Transient,表示将这个属性忽略
 * 6.通用Mapper有几个方法是需要主键的,如selectByPrimaryKey等,所以可以在主键对应的实体类属性上加上注解@Id,声明这个属性是主键属性,如果不加的话,所有的属性都会作为主键进行使用,这样会很大程度的影响效率
 * 7.因为基本类型在对象初始化的时候会默认值,无法消除,所以实体类尽量使用包装类
 * 8.Mapper还提供了序列(支持Oracle)、UUID(任意数据库,字段长度32)、主键自增(类似Mysql,Hsqldb)三种方式，其中序列和UUID可以配置多个，主键自增只能配置一个。
 * 这三种方式不能同时使用,同时存在时按照 序列>UUID>主键自增的优先级进行选择.
 * 序列://可以用于数字类型,字符串类型(需数据库支持自动转型)的字段,@SequenceGenerator(name="Any",sequenceName="seq_userid"),该字段不会回写id
 * UUID:@GeneratedValue(generator = "UUID")该字段不会回写id
 * 主键自增:不限于@Id注解的字段,但是一个实体类中只能有一个@GeneratedValue(strategy = GenerationType.IDENTITY),会回写id
 */
public interface CommonMapper<T> extends IdsMapper<T>,ConditionMapper<T>,Mapper<T>,MySqlMapper<T> {

}
