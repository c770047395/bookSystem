package com.book.controller;

import com.book.pojo.Books;
import com.book.service.BookService;
import com.book.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调service层
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    //查询全部的数据并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    @RequestMapping("toAddBook")
    public String toAddPaper(Model model){
        model.addAttribute("title","新增书籍");
        model.addAttribute("action","/book/addBook");
        return "addBook";
    }

    @RequestMapping("addBook")
    public String addBook(Books book){
        System.out.println(book);
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("deleteBook")
    public String deleteBook(@RequestParam("bookID") int bookID){
        bookService.deleteBookById(bookID);
        return "redirect:/book/allBook";
    }

    @RequestMapping("toUpdateBook")
    public String toUpdatePaper(@RequestParam("bookID") int bookID, Model model){
        Books book = bookService.queryBookById(bookID);
        model.addAttribute("title","修改书籍");
        model.addAttribute("action","/book/updateBook");
        model.addAttribute("book",book);
        return "addBook";
    }

    @RequestMapping("updateBook")
    public String updateBook(Books book){
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("queryBook")
    public String queryBook(@RequestParam("queryBookName") String name,Model model){
        Books books = bookService.queryBookByName(name);
        List<Books> list = new ArrayList<Books>();

        if(books != null) {
            list.add(books);
        }else{
            list = bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "allBook";
    }

}
