[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/jwssRZI4)
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>Setting Up and Testing the Project</h1>

<p>To begin with, ensure a smooth setup of the project and perform comprehensive testing, follow the steps outlined below:</p>

<ol>
  <li><strong>Clone the Repository:</strong>
    <p>Access the GitHub repository by navigating to the following link: <a href="https://github.com/ADA-GWU/2024-a2-cicd-atlashamzali">ADA-GWU/2024-a2-cicd-atlashamzali</a>.<br>
    Clone the repository to your local machine using Git or any preferred version control tool.</p>
  </li>

  <li><strong>Open the Project in Your Code Editor:</strong>
    <p>Once the repository is cloned successfully, navigate to the directory containing the project.<br>
    Open your preferred code editor and import the project.<br>
    Locate the file <code>src\main\java\ada\edu\demo\webtest\JpademoApplication.java</code> within the project structure.</p>
  </li>
  <p>After opening the project in your code editor, follow these steps to build the project using Maven:</p>

<ol>
  <li><strong>Open Terminal:</strong></li>
  <p>Open the terminal/command prompt on your system.</p>

  <li><strong>Navigate to Project Directory:</strong></li>
  <p>Use the <code>cd</code> command to navigate to the directory containing the project.</p>

  <li><strong>Run Maven Command:</strong></li>
  <p>Write the following command and press Enter:</p>
  <pre><code>mvn clean</code></pre>
</ol>

  <li><strong>Run the Project:</strong>
    <p>Inside your code editor, navigate to the mentioned Java file.<br>
    Click the button located on the bottom right corner of the code editor to initiate the project.<br>
    Check the terminal/console output for any errors or warnings to ensure the project is running smoothly.</p>
  </li>

  <li><strong>Access the Web Page:</strong>
    <p>Open your Firefox web browser.<br>
    In the address bar, enter the URL <code>http://localhost:8080/student/</code> to access the web page corresponding to the project.<br>
    Verify that the page loads correctly without any errors.</p>
  </li>

  <li><strong>Testing:</strong>
    <p>Return to your code editor.<br>
    Explore the testing section to examine all the available test cases for the project.<br>
    Ensure all test cases are appropriately designed and implemented to cover the desired functionalities.</p>
  </li>

  <li><strong>Execute Test Cases:</strong>
    <p>Click on the "Run Test" button adjacent to the webtest section to execute all the test cases.<br>
    Monitor the test execution process for any failures or errors.</p>
  </li>
</ol>

<p>By following these steps meticulously, you will be able to set up the project, verify its functionality, and execute comprehensive testing procedures to ensure its robustness and reliability.</p>

<h2>Code Explanation:</h2>
<h2>Unit Test<h2>
<h2>Code:</h2>

<pre><code>
@Test
void testGetTotalCredits() {
    Student student = new Student();
    Course course1 = new Course();
    course1.setCredits(3);
    Course course2 = new Course();
    course2.setCredits(4);
    student.setCourses(Arrays.asList(course1, course2));
    int totalCredits = student.getTotalCredits();
    assertEquals(7, totalCredits);
}
</code></pre>

<p>The provided code is a test case written in Java using JUnit, a testing framework. It aims to verify the correctness of the <code>getTotalCredits()</code> method in the <code>Student</code> class.</p>

<h3>Steps:</h3>

<ol>
  <li>Create a new <code>Student</code> object.</li>
  <li>Create two <code>Course</code> objects, each with a specific number of credits.</li>
  <li>Add these courses to the student's list of courses.</li>
  <li>Calculate the total credits using the <code>getTotalCredits()</code> method of the <code>Student</code> class.</li>
  <li>Verify that the total credits calculated match the expected value (7 in this case).</li>
</ol>

<p>This test ensures that the <code>getTotalCredits()</code> method correctly sums up the credits of all courses associated with a student.</p>

<h2>Functionality Test</h2>
<h2>Code:</h2>

<pre><code>
@Test
@DisplayName("Test finding student by ID")
public void testFindStudentById() {

    // Set up
    int studentId = 1;
    Student mockedStudent = new Student();
    mockedStudent.setStudentId(studentId);
    mockedStudent.setFirstName("Atlas");
    mockedStudent.setLastName("Hamzali");
    when(studentRepository.findById(studentId)).thenReturn(Optional.of(mockedStudent));

    // Execution
    Optional<Student> result = studentRepository.findById(studentId);

    // Assertion
    assertNotNull(result);
    assertEquals(studentId, result.get().getStudentId());
    assertEquals("Atlas", result.get().getFirstName());
    assertEquals("Hamzali", result.get().getLastName());
}
</code></pre>

<h2>Explanation:</h2>

<p>This code is a JUnit test case that verifies finding a student by their ID in the application.</p>

<p><strong>Steps:</strong></p>

<ol>
  <li><strong>Setup:</strong> 
    <ul>
      <li>Initialize variables like student ID and a mocked student object with relevant data.</li>
      <li>Mock the behavior of the <code>findById()</code> method to return the mocked student when called with the specified ID.</li>
    </ul>
  </li>
  
  <li><strong>Execution:</strong> 
    <ul>
      <li>Invoke the <code>findById()</code> method with the student ID to retrieve the student.</li>
    </ul>
  </li>
  
  <li><strong>Assertion:</strong> 
    <ul>
      <li>Ensure that the returned student object is not null.</li>
      <li>Check if the attributes of the returned student match the expected values.</li>
    </ul>
  </li>
</ol>

<p>This test confirms that the application correctly retrieves a student by their ID from the repository and that the student's attributes match the expected values.</p>

</body>
</html>

