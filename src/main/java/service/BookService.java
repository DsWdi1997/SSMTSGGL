package service;

import org.apache.ibatis.annotations.Param;
import pojo.BooK;

import java.util.List;

public interface BookService {
    //增加一个Books
    int addBook(BooK books);

    //根据id删除Books
    int deleteBookByID( @Param("bookID") int id);

    //更新Books
    int updateBook(BooK books);

    //根据id查询Book
    BooK queryBookByID(@Param("bookID") int id);

    //查看全部的Book
    List<BooK> queryAllBook();

}
