import com.book.pojo.Books;
import com.book.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = context.getBean("bookServiceImpl", BookService.class);
        Books book = new Books(0,"test",10,"test");
        bookServiceImpl.deleteBookById(7);
    }
}
