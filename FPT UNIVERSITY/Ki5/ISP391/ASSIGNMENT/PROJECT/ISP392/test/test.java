
import Base.Base;
import static Base.Base.PAGE_SIZE;
import DAO.BlogDAO;
import DAO.LessonDAO;
import DAO.RoleDAO;
import DAO.SubjectDAO;
import DAO.TopicDAO;
import DAO.UserDAO;
import java.util.ArrayList;
import java.util.List;
import model.Blog;
import model.Lesson;
import model.Role;
import model.Subject;
import model.User;
import util.SendEmail;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class test {

    public static void main(String[] args) {
        DAO.UserDAO userdao = new UserDAO();
        DAO.TopicDAO topicdao = new TopicDAO();
        DAO.BlogDAO dao = new BlogDAO();
        DAO.LessonDAO dao1 = new LessonDAO();
        List<Lesson> list = dao1.getAllLesson(1);
        System.out.println(list);
//        int t = userdao.getNumberUser();
//        int t1 = topicdao.getNumberTopic();
//        Blog blog = dao.getBlogById(3);
//        List<Blog> list = dao.getAllBlog();
//        System.out.println(list);
//        System.out.println(t);
//            User admin = userdao.login("thinh123", "123123");
//            System.out.println(admin);
//        UserDAO d = new UserDAO();
//        List<User> listUsers = d.getAllUser();
//        String message = "Welcome to join";
//                 User acc = d.checkUserExist("thinh123");
//        int userid = userdao.getUserIdByEmail("hoangxthinh@gmail.com");
//        System.out.println(userid);
//        System.out.println(listUsers);
//        RoleDAO role = new RoleDAO();
//        Role role1 = role.getRoleByID(2);
//        System.out.println(role1);
//        SubjectDAO daosub = new SubjectDAO();
//        List<Subject> listSubject = daosub.getAllSubject();
//        System.out.println(listSubject);
//        List<Blog> listBlog = dao.getAllBlog();
//        System.out.println(listBlog);
//        String url = "http://localhost:9999/ISP392/editcourse.jsp";
//        int index = url.lastIndexOf("/");
//        String resource = url.substring(index + 1);
//        System.out.println(resource);
//        ///////////////-ADMIN-//////////////////////////
//        List<String> ADMIN_URL = new ArrayList<>();
//        //SERVLETS
//        //JSP
//        ADMIN_URL.add("editcourse.jsp");
//        ADMIN_URL.add("listUsers.jsp");
/////////////////-USER-//////////////////////////
//        List<String> USER_URL = new ArrayList<>();
//        //JSP
//        USER_URL.add("changeProfile.jsp");
//        USER_URL.add("change.jsp");
//        USER_URL.add("coursedetail.jsp");
//        USER_URL.add("blog.jsp");
//        //SERVLETS
//        USER_URL.add("logout");
//        USER_URL.add("SubjectListController");
/////////////////-GUEST-//////////////////////////       
//        List<String> GUEST_URL = new ArrayList<>();
//        GUEST_URL.add("about.jsp");
//        GUEST_URL.add("forgot.jsp");
//        GUEST_URL.add("login.jsp");
//        GUEST_URL.add("register.jsp");
//        GUEST_URL.add("register");
//        GUEST_URL.add("login");
//        User user = userdao.getUserByID(10);
//        if (user != null) {
//            int role = user.getRoleID();
//            if (role == 3) {
//                if (ADMIN_URL.contains(resource)) {
//                    System.out.println("Admin cho qua");
//                } else {
//                    System.out.println("home user");
//
//                }
//            } else if (role == 2) {
//                if (USER_URL.contains(resource)) {
//                    System.out.println("User cho qua");
//                } else {
//                    System.out.println("home user");
//                }
//            }
//        } else {
//            if (GUEST_URL.contains(resource)) {
//                System.out.println("Guest Yes");
//            } else {
//                System.out.println("home guest");
//            }
//        }
        int i = PAGE_SIZE;
        System.out.println(i);
    }
}
