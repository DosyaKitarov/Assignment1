import java.util.Arrays;

public class Reader {
    private String fullName;
    private int ID;
    private String faculty;
    private String birth;
    private  String phone;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    Reader(String fullName, int ID, String faculty, String birth, String phone){
        this.fullName=fullName;
        this.ID=ID;
        this.faculty=faculty;
        this.birth=birth;
        this.phone=phone;
    }
    public void takeBook(int takenBookNumber)
    {
        System.out.println(fullName +" took "+takenBookNumber+" books");
    }
    public void takeBook(String... bookTitles)
    {
        System.out.println(fullName +" took books: "+ Arrays.toString(bookTitles));
    }

    public void takeBook(Book... Books){
        String[] bookTitles = new String[Books.length];
        for (int i = 0; i < Books.length; i++) {
            bookTitles[i] = Books[i].getBookName();
        }
        System.out.println(fullName + " took books: " + Arrays.toString(bookTitles));
    }
    public void returnBook(int returnedBookNumber)
    {
        System.out.println(fullName +" returned "+returnedBookNumber+" books");
    }
    public void returnBook(String... bookTitles)
    {
        System.out.println(fullName +" returned books: "+ Arrays.toString(bookTitles));
    }

    public void returnBook(Book... Books){
        String[] bookTitles = new String[Books.length];
        for (int i = 0; i < Books.length; i++) {
            bookTitles[i] = Books[i].getBookName();
        }
        System.out.println(fullName + " returned books: " + Arrays.toString(bookTitles));
    }
}
