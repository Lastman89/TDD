import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class PhoneBookTest {
    PhoneBook pBook = new PhoneBook();
    @Test
    public void testAdd(){
        PhoneBook pBook = new PhoneBook();
        String nameTest = "Ivan";
        String phoneTest = "79134158924";

        int quantityPhone = pBook.add(nameTest, phoneTest);
        Assertions.assertTrue(quantityPhone > 0);

    }



}
