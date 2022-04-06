package mapper;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import data.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：Mybatis_Plus实现查询操作之selectOne_selectCount和selectList
 * Package(包名): mapper
 * Class(测试类名): StudentMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/6
 * Time(创建时间)： 18:57
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

class StudentMapperTest
{
    /**
     * Select one.
     * 根据 entity 条件，查询一条记录
     * 查询一条记录，例如 qw.last("limit 1") 限制取一条记录, 注意：多条数据会报异常
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectOne() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_no", 202012341048L);

        Student student = studentMapper.selectOne(queryWrapper);
        System.out.println(student);

        sqlSession.close();
    }

    /**
     * Select one.
     * 根据 entity 条件，查询一条记录
     * 查询一条记录，例如 qw.last("limit 1") 限制取一条记录, 注意：多条数据会报异常
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectOne1() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_no", 202012341048L);
        queryWrapper.eq("sex", "男");

        Student student = studentMapper.selectOne(queryWrapper);
        System.out.println(student);

        sqlSession.close();
    }

    /**
     * Select one.
     * 根据 entity 条件，查询一条记录
     * 查询一条记录，例如 qw.last("limit 1") 限制取一条记录, 注意：多条数据会报异常
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectOne2() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_no", 202012341048L);
        queryWrapper.eq("sex", "女");

        Student student = studentMapper.selectOne(queryWrapper);
        System.out.println(student);

        sqlSession.close();
    }

    /**
     * Select one.
     * 根据 entity 条件，查询一条记录
     * 查询一条记录，例如 qw.last("limit 1") 限制取一条记录, 注意：多条数据会报异常
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectOne3() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //queryWrapper.eq("student_no", 202012341048L);
        //异常
        queryWrapper.eq("sex", "女");

        Student student = studentMapper.selectOne(queryWrapper);
        System.out.println(student);

        sqlSession.close();
    }

    /**
     * Select count.
     * 根据 Wrapper 条件，查询总记录数
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectCount() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //queryWrapper.eq("student_no", 202012341048L);
        queryWrapper.eq("sex", "女");

        //女性数量
        Long count = studentMapper.selectCount(queryWrapper);
        System.out.println(count);

        queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sex", "男");
        //男性数量
        count = studentMapper.selectCount(queryWrapper);
        System.out.println(count);

        //总数量
        count = studentMapper.selectCount(null);
        System.out.println(count);

        sqlSession.close();
    }

    /**
     * Select count.
     * 根据 Wrapper 条件，查询总记录数
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectCount1() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //学号小于202012340658L的数量
        queryWrapper.lt("student_no", 202012340658L);

        Long count = studentMapper.selectCount(queryWrapper);
        System.out.println(count);

        sqlSession.close();
    }

    /**
     * Select count.
     * 根据 Wrapper 条件，查询总记录数
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectCount2() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //名字包含陈的数量
        queryWrapper.like("name", "陈");

        Long count = studentMapper.selectCount(queryWrapper);
        System.out.println(count);

        sqlSession.close();
    }


    /**
     * Select list.
     * 根据 entity 条件，查询全部记录
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectList() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //名字包含陈的学生
        queryWrapper.like("name", "陈");

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        sqlSession.close();
    }

    /**
     * Select list.
     * 根据 entity 条件，查询全部记录
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectList1() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //班级是1001L的学生
        queryWrapper.eq("class_no", 1001L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        sqlSession.close();
    }

    /**
     * Select list.
     * 根据 entity 条件，查询全部记录
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectList2() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //学号小于202012340658L的学生
        queryWrapper.lt("student_no", 202012340658L);

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        sqlSession.close();
    }

    /**
     * Select list.
     * 根据 entity 条件，查询全部记录
     *
     * @throws IOException the io exception
     */
    @Test
    public void selectList3() throws IOException
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //sex=男
        queryWrapper.eq("sex", "男");

        List<Student> list = studentMapper.selectList(queryWrapper);
        for (Student student : list)
        {
            System.out.print(student);
        }

        sqlSession.close();
    }
}