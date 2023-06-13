public class Bookshelf
{
   public static void main(String[] args)
   {
      Book book1, book2, book3;
      
      book1 = new Book();
      book2 = new Book();
      book3 = new Book();
      
      book1.setTitle("Mobestiary");
      book1.setAuthor("Alex Wiltshire");
      book1.setPublisher("Del Rey");
      book1.setCopyDate("Ocotber 10th, 2017");
      
      book2.setTitle("Ninja: Get Good: My Ultimate Guide to Gaming");
      book2.setAuthor("Tyler Blevins");
      book2.setPublisher("Clarkson Potter");
      book2.setCopyDate("August 20th, 2019");
      
      book3.setTitle("Five Nights at Freddy's: The Silver Eyes");
      book3.setAuthor("Scott Cawthon");
      book3.setPublisher("Scholastic Inc.");
      book3.setCopyDate("December 17th, 2015");
      
      book1.toString();
      book2.toString();
      book3.toString();
      
   }
    
   
}