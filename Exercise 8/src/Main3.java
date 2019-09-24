import java.sql.*;

public class Main3 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:postgresql://127.0.0.1:5432/school",
                            "postgres",
                            "11oktober");

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from student");

            for (int i = 0;  true ; i++) {
                if (rs.next()){
                    System.out.println(rs.getString("name")+","+rs.getString("gender"));
                }else {
                    break;
                }
            }

            Integer id = 7;
            String name = "Computer Network";
            Integer sks = 3;

            String querynya = "insert into subject(id, subject_name, sks) values("+id+",'"+name+"','"+sks+"')";
            System.out.println(querynya);
            statement.executeUpdate(querynya);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            ResultSet ra = statement.executeQuery("select * from subject");
            for (int i = 0; true; i++){
                if (ra.next()){
                    System.out.println(ra.getString("subject_name")+","+ra.getString("sks"));
                }else {
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
