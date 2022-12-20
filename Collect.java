
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Collect {

    private static String date;
    private static String time;
    private static String name;
    private static int WPM;
    private Menu menu;
    private Frame frame;

    public Collect() {

        LocalDateTime Date = LocalDateTime.now();
        DateTimeFormatter Dates = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter Times = DateTimeFormatter.ofPattern("HH:mm:ss");

        date = String.valueOf(Date.format(Dates));
        time = String.valueOf(Date.format(Times));
        name = menu.getName().getText();
        WPM = frame.getWPM();

    }

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "");
            Statement st = con.createStatement();
            
            String query = "INSERT INTO score " + 
                "(date, time, name, wpm)" + 
                "VALUES ('"+date+"','"+time+"', '"+ name +"', "+ WPM +")";
            
            st.execute(query);
        } catch (Exception ex) {
        }
        return con;
    }

    public static void showData() {
        String sql = "select * from score";
        try {
            Connection c = getConnection();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Collect().showData();
    }
}
