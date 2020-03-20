/**
 * <h1>biodata dari customer</h1>
 *  class Customer merupakan class yang menyimpan nama, email, password
 *  dan tanggal join customer
 *  @author Muhammad Farhan
 *  @27/02/2020
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Customer
{
    
    private int id;//variabel id pelanggan
    private String name;//variabel nama pelanggan
    private String email;//variabel email pelanggan
    private String password;//variabel password pelanggan
    private Calendar joinDate;//variabel tanggal pelanggan bergabung
    /***
     * constructor customer digunakan untuk memasukkan biodata baru
     * @params id, name, email, password, joinDate
     * @return tidak ada
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate) {
        this.id = id; //mengganti nilai variabel id yang lama dengan parameter yang dimasukkan
        this.name = name;//mengganti nilai variabel name yang lama dengan parameter yang dimasukkan
        String emailr = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
     
            Pattern p1 = Pattern.compile(emailr);
     
            Matcher m1 = p1.matcher(email);
            if(m1.matches()) {
                this.email=email;
                System.out.println(email);
            }
            else {
                this.email="";
                System.out.println(email);
            }
        
        String passr = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p2 = Pattern.compile(passr);
        Matcher m2 = p2.matcher(password);
        if(m2.matches())
        {
            this.password=password;
            System.out.println(password);
        }
        else 
        {
            this.password="";
            System.out.println(password);
        }
        
        this.joinDate = joinDate;//mengganti nilai variabel joinDate yang lama dengan parameter yang dimasukkan
    }
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        this.id = id; //mengganti nilai variabel id yang lama dengan parameter yang dimasukkan
        this.name = name;//mengganti nilai variabel name yang lama dengan parameter yang dimasukkan
        String emailr = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
     
            Pattern p1 = Pattern.compile(emailr);
     
            Matcher m1 = p1.matcher(email);
            if(m1.matches()) {
                this.email=email;
                System.out.println(email);
            }
            else {
                this.email="";
                System.out.println(email);
            }
        
        String passr = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p2 = Pattern.compile(passr);
        Matcher m2 = p2.matcher(password);
        if(m2.matches())
        {
            this.password=password;
            System.out.println(password);
        }
        else 
        {
            this.password="";
            System.out.println(password);
        }
        
        this.joinDate = new GregorianCalendar(year,month,dayOfMonth);//mengganti nilai variabel joinDate yang lama dengan parameter yang dimasukkan
        
    }
    
    public Customer(int id, String name, String email, String password) {
        this.id = id; //mengganti nilai variabel id yang lama dengan parameter yang dimasukkan
        this.name = name;//mengganti nilai variabel name yang lama dengan parameter yang dimasukkan
        String emailr = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
     
            Pattern p1 = Pattern.compile(emailr);
     
            Matcher m1 = p1.matcher(email);
            if(m1.matches()) {
                this.email=email;
                System.out.println(email);
            }
            else {
                this.email="";
                System.out.println(email);
            }
        
        String passr = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p2 = Pattern.compile(passr);
        Matcher m2 = p2.matcher(password);
        if(m2.matches())
        {
            this.password=password;
            System.out.println(password);
        }
        else 
        {
            this.password="";
            System.out.println(password);
        }
    }
    
    
    /***
     * getter getId digunakan untuk memanggil id yang saat ini tersimpan di memori
     * @params tidak ada
     * @return id
     */
    public int getId() {
        
        return id;//mengembalikan nilai id
    }
    /***
     *  getter getName digunakan untuk memanggil nama yang saat ini tersimpan di memori
     * @params tidak ada
     * @return nama
     */
    public String getName() {
        
        return name;//mengembalikan nilai name
    }
    /***
     * getter getEmail digunakan untuk memanggil email yang saat ini tersimpan di memori
     * @params tidak ada
     * @return email
     */
    public String getEmail() {
        
        return email;//mengembalikan nilai email
    }
    /***
     * getter getPassword digunakan untuk memanggil password yang saat ini tersimpan di memori
     * @params tidak ada
     * @return password
     */
    public String getPassword() {
        
        return password;//mengembalikan nilai password
    }
    /***
     * variable getJoinDate
     */
    public Calendar getJoinDate()
        {
            return joinDate;
        }//mengembalikan nilai getJoinDate
    /***
     * setter setId digunakan untuk menyimpan id baru
     * this.id adalah digunakan untuk merujuk ke variabel id saat ini
     * @params id
     * @return tidak ada
     */
    public void setId(int id) {
        
        this.id = id;//mengganti nilai id sesuai setter
    }
    /***
     * setter setName digunakan untuk menyimpan id baru
     * this.name adalah digunakan untuk merujuk ke variabel name saat ini
     * @params name
     * @return tidak ada
     */
    public void setName(String name) {
        
        this.name = name;//mengganti nilai name sesuai setter
    }
    /***
     * setter setEmail digunakan untuk menyimpan email baru
     * this.email adalah digunakan untuk merujuk ke variabel email saat ini
     * @params email
     * @return tidak ada
     */
    public void setEmail(String email)
        {
            String r = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
     
            Pattern p = Pattern.compile(r);
     
            Matcher m = p.matcher(email);
            if(m.matches()) {
                this.email=email;
                System.out.println(email);
            }
            else {
                this.email="";
                System.out.println(email);
            }
        }
    /***
     * setter setPassword digunakan untuk menyimpan password baru
     * this.password adalah digunakan untuk merujuk ke variabel password saat ini
     * @params password
     * @return tidak ada
     */
    public void setPassword(String password) {
        
        String r = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(password);
        if(m.matches())
        {
            this.password=password;
            System.out.println(password);
        }
        else 
        {
            this.password="";
            System.out.println(password);
        }
    }
    /***
     * setter joinDate digunakan untuk menyimpan tanggal baru
     * this.joinDate adalah digunakan untuk merujuk ke variabel joinDate saat ini
     * @params joinDate
     * @return tidak ada
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate=joinDate;
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate=new GregorianCalendar(year,month,dayOfMonth);
    }
    /***
     * Ketika method printData dipanggil maka akan menampilkan isi dari variabel name
     * @params tidak ada
     * @return tidak ada
     */
    public String toString()
    {
        String output = "";
        if(joinDate!=null) {
            Date date = joinDate.getTime();             
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            String date1 = format1.format(date);  
            output = "################Customer###############\n"+
                   "ID = "+ id+ "\n"+ "Nama = "+ name+ "\n"+ "Email = "+ email+ "\n"+ "Password = "+ password+ "\n"+
                   "Join Date = "+ date1+ "\n";
        }
        else
        {
            output = "################Customer###############\n"+ "ID = " + id + "\n" + "Nama = " + name + "\n" + "Email = " + email + "\n" +
                   "Password = "+ password + "\n";
        }
        return output;
    }
    
    
   
    
}
