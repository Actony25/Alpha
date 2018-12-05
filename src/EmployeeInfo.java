import java.util.Scanner;
import java.util.regex.*;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in;

  public EmployeeInfo() {
    p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
    in = new Scanner(System.in);
    setName();
    setDeptId();
    in.close();
  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) { //valid if name includes space. False if not
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else {
      code = "guest";
    }
  }

  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    String nameString = in.nextLine();
    return nameString;
  }

  public String getDeptId() {
    System.out.print("Please enter the department ID: ");
    String id = in.nextLine();
    return id;
  }

  private void setDeptId() {
    String id = getDeptId();
    if (validId(id)) {
      this.deptId = reverseString(id);
    } else {
      this.deptId = "Base00";
    }
  }

  private String getId() {
    return this.deptId;
  }

  private boolean validId(String id) {
    Matcher matcher = p.matcher(id);
    return matcher.matches();
  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

  public String reverseString(String id) {
    byte [] strAsByteArray = id.getBytes();
    byte [] result = new byte [strAsByteArray.length];

    // Store result in reverse order into the
    // result byte[]
    for (int i = 0; i<strAsByteArray.length; i++) {
      result[i] = strAsByteArray[strAsByteArray.length - i - 1];
    }
    return new String(result);
  }

  public String toString() {
    return "Employee Code : " + this.code +
        "\nDepartment Number : " + this.deptId;
  }
}
