package service;

import dao.BookDao;
import pojo.BooK;

import java.util.List;

public class BookServiceImpl implements  BookService{
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public int addBook(BooK books) {
        return bookDao.addBook(books);
    }

    @Override
    public int deleteBookByID(int id) {
        return bookDao.deleteBookByID(id);
    }

    @Override
    public int updateBook(BooK books) {
        return bookDao.updateBook(books);
    }

    @Override
    public BooK queryBookByID(int id) {
        return bookDao.queryBookByID(id);
    }

    @Override
    public List<BooK> queryAllBook() {
        return bookDao.queryAllBook();
    }
}
