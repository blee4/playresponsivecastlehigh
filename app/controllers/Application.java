package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.StudentsParents;
import views.html.FacultyStaff;
import views.html.AlumniFriends;
import views.html.ContactUs;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */

  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns the studentsParents page.
   * @return The resulting studentsParents page.
   */

  public static Result studentsParents() {
    return ok(Index.render("Welcome to the Students/Parents page."));
  }

  /**
   * Returns the facultyStaff page.
   * @return The resulting facultyStaff page.
   */

  public static Result facultyStaff() {
    return ok(Index.render("Welcome to the Faculty/Staff page."));
  }

  /**
   * Returns the alumniFriends page.
   * @return The resulting alumniFriends page.
   */

  public static Result alumniFriends() {
    return ok(Index.render("Welcome to the Alumni/Friends page."));
  }

  /**
   * Returns the contactUs page.
   * @return The resulting contactUs page.
   */

  public static Result contactUs() {
    return ok(Index.render("Welcome to the Contact Us page."));
  }

}
